package com.eci.cosw.springbootsecureapi.model;

public class Game {
    private String name;
    private String description;
    private long price;
    private int rate;
    private ArrayList<Seller> sellers= new ArrayList<Seller>();
    private String photo;
    private String link;
    private ArrayList<Comment> comments=new ArrayList<Comment>();


    public Game(){

    }

    public Game(String name,String description,long price, int rate,ArrayList<Seller> sellers,String photo,ArrayList<Comment> comments){
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
    public ArrayList<Seller> getSellers() {
        return sellers;
    }
    public String getPhoto() {
        return photo;
    }

    public ArrayList<Comment>  getComments() {
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
    public void setSellers(ArrayList<Seller>  sellers) {
        this.sellers=sellers;
    }
    public void setPhoto(String photo) {
        this.photo=photo;
    }

    public void setComments(ArrayList<Comment>  comments) {
        this.comments = comments;
    }
}
