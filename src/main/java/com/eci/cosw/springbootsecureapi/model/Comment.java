package com.eci.cosw.springbootsecureapi.model;

public class Comment {
    private String comment;
    private int rate;
    public Comment(){

    }

    public Comment(String comment,int rate){
        this.comment=comment;
        this.rate=rate;
    }
}
