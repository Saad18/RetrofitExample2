package com.saad.retrofitexample2;

import com.google.gson.annotations.SerializedName;

public class Comment {

    int postId;

    int Id;

    String name;

    String email;

    @SerializedName("body")
    String text;

    public int getPostId() {
        return postId;
    }

    public int getId() {
        return Id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getText() {
        return text;
    }
}
