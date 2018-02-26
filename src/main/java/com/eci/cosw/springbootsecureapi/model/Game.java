package com.eci.cosw.springbootsecureapi.model;

import java.util.List;

public class Game {
    private String name;
    private String photo;
    private String description;
    private long price;
    private int rate;
    private List<Seller> sellers;
    private String link;
    private List<Comment> comments;


    public Game(){

    }

    public Game(String name,String description,long price, int rate,List<Seller> sellers,String photo,List<Comment> comments){
        this.name=name;
        this.description=description;
        this.rate=rate;
        this.sellers=sellers;
        this.photo=photo;
        this.comments=comments;

    }


    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }
    public int getRate() {
        return rate;
    }
    public List<Seller> getSellers() {
        return sellers;
    }
    public String getPhoto() {
        return photo;
    }

    public List<Comment>  getComments() {
        return comments;
    }

    public void setName(String name) {
        this.name=name;
    }
    public void setDescription(String description) {
        this.description=description;
    }

    public void setRate(int rate) {
        this.rate=rate;
    }
    public void setSellers(List<Seller>  sellers) {
        this.sellers=sellers;
    }
    public void setPhoto(String photo) {
        this.photo=photo;
    }

    public void setComments(List<Comment>  comments) {
        this.comments = comments;
    }
}
