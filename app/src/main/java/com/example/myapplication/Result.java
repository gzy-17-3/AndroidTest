package com.example.myapplication;

import java.util.List;

// 数据模型  model
public class Result {


    /**
     * users : [{"id":2587459,"slug":"82854a3500fc","nickname":"穿着prada挤地铁","avatar_source":"http://upload.jianshu.io/users/upload_avatars/2587459/9f4cfc0f-88b8-420c-b36e-9741e1191644.jpg","total_likes_count":5470,"total_wordage":342384,"is_following_user":false},{"id":13213889,"slug":"080bb4eac1c9","nickname":"无限猴子","avatar_source":"http://upload.jianshu.io/users/upload_avatars/13213889/7314c5cc-ca7f-4542-b914-2c8dffaf324d.jpg","total_likes_count":2168,"total_wordage":401776,"is_following_user":false},{"id":7290998,"slug":"4062aaeba322","nickname":"念远怀人","avatar_source":"http://upload.jianshu.io/users/upload_avatars/7290998/f64f5ef0-def0-4b26-beb3-b9d88f060ba0.jpg","total_likes_count":13837,"total_wordage":669564,"is_following_user":false},{"id":4263857,"slug":"40ec0e1adf50","nickname":"王小麦","avatar_source":"http://upload.jianshu.io/users/upload_avatars/4263857/34d7b217-7338-48fe-81a1-98367fecdbee.jpg","total_likes_count":40259,"total_wordage":137471,"is_following_user":false},{"id":301940,"slug":"ef4f2422125f","nickname":"卢璐说","avatar_source":"http://upload.jianshu.io/users/upload_avatars/301940/189d69dd-af7c-4290-9e2c-89e98acf3603.jpg","total_likes_count":26750,"total_wordage":1205008,"is_following_user":false}]
     * total_count : 28535
     */

    private int total_count;
    private List<UsersBean> users;

    public int getTotal_count() {
        return total_count;
    }

    public void setTotal_count(int total_count) {
        this.total_count = total_count;
    }

    public List<UsersBean> getUsers() {
        return users;
    }

    public void setUsers(List<UsersBean> users) {
        this.users = users;
    }

    public static class UsersBean {
        /**
         * id : 2587459
         * slug : 82854a3500fc
         * nickname : 穿着prada挤地铁
         * avatar_source : http://upload.jianshu.io/users/upload_avatars/2587459/9f4cfc0f-88b8-420c-b36e-9741e1191644.jpg
         * total_likes_count : 5470
         * total_wordage : 342384
         * is_following_user : false
         */

        private int id;
        private String slug;
        private String nickname;
        private String avatar_source;
        private int total_likes_count;
        private int total_wordage;
        private boolean is_following_user;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getSlug() {
            return slug;
        }

        public void setSlug(String slug) {
            this.slug = slug;
        }

        public String getNickname() {
            return nickname;
        }

        public void setNickname(String nickname) {
            this.nickname = nickname;
        }

        public String getAvatar_source() {
            return avatar_source;
        }

        public void setAvatar_source(String avatar_source) {
            this.avatar_source = avatar_source;
        }

        public int getTotal_likes_count() {
            return total_likes_count;
        }

        public void setTotal_likes_count(int total_likes_count) {
            this.total_likes_count = total_likes_count;
        }

        public int getTotal_wordage() {
            return total_wordage;
        }

        public void setTotal_wordage(int total_wordage) {
            this.total_wordage = total_wordage;
        }

        public boolean isIs_following_user() {
            return is_following_user;
        }

        public void setIs_following_user(boolean is_following_user) {
            this.is_following_user = is_following_user;
        }
    }
}
