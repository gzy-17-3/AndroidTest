package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.alibaba.fastjson.JSON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);


        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                test1();
            }
        });

        thread.start();

    }

    void test1(){
        String urlStr = "https://www.jianshu.com/users/recommended?seen_ids=14715425%2C5796592%2C4287007%2C3136195%2C3343569&count=5&only_unfollowed=true";
        try {
            URL url = new URL(urlStr);
            HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
            urlConnection.setRequestMethod("GET");
            urlConnection.setConnectTimeout(6000);
            urlConnection.setReadTimeout(6000);
            InputStream stream = urlConnection.getInputStream();

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(stream));

            StringBuilder result = new StringBuilder();
            String temp;
            temp = bufferedReader.readLine();

            while (temp != null){
                result.append(temp);
                temp = bufferedReader.readLine();
            }

            Log.e("", "result: " + result.toString());

            final Result result1 = JSON.parseObject(result.toString(), Result.class);

            Log.e("", "result: " + result1.toString());

            runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    showMessage(result1);
                }
            });

        } catch (final IOException e) {
            e.printStackTrace();

            runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    Toast.makeText(MainActivity.this,e.toString(),Toast.LENGTH_LONG).show();
                }
            });
        }
    }

    void showMessage(Result result1){
        if (result1.getTotal_count() > 0){
            Toast.makeText(this, "成功：" + result1.getTotal_count(), Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this, "失败：" + result1.getTotal_count(), Toast.LENGTH_SHORT).show();
        }
    }
}
