package com.eci.cosw.springbootsecureapi.model;

public class Game {
    private String name;
    private String description;
    private long price;
    private int rate;
    private Seller sellers[];
    private String photo;
    private String link;
    private Comment comments[];


    public Game(){

    }

    public Game(String name,String description,long price, int rate,Seller[] sellers,String photo){
        this.name=name;
        this.description=description;
        this.rate=rate;
        this.sellers=sellers;
        this.photo=photo;

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
    public Seller[] getSellers() {
        return sellers;
    }
    public String getPhoto() {
        return photo;
    }

    public Comment[] getComments() {
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
    public void setSellers(Seller[] sellers) {
        this.sellers=sellers;
    }
    public void setPhoto(String photo) {
        this.photo=photo;
    }

    public void setComments(Comment[] comments) {
        this.comments = comments;
    }
}
