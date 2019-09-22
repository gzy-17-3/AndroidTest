package com.example.myapplication;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

public class MainThreadActivity extends AppCompatActivity {

    //  多线程
    //  主运行循环  runloop
    //
    //      ------------>       主线程
    //    子线程
    //      ---->    访问网络   线程堵塞
    //      ---->    处理大文件

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                test1();
            }
        };

        Thread thread =  new Thread(runnable);

        thread.start();

    }


    void test1(){
        Thread thread = Thread.currentThread();
        Log.e("tag", "onCreate: " + thread.getName());

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Log.e("tag", "onCreate:  >> 2" + thread.getName());
    }
}
