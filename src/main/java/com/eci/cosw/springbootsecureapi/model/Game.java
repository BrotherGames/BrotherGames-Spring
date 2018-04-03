
package com.eci.cosw.springbootsecureapi.model;

import javax.persistence.*;
import java.util.List;
import static javax.persistence.CascadeType.ALL;

@Entity
@Table (name="game")
public class Game {
    private String name;
    private String photo;
    private String description;
    private int rateAcum;
    private List<Seller> sellers;



    private String link;
    private List<Comment> comments;
    private int id;




    public Game(String name,String description,int id, int rate,List<Seller> sellers,String photo,List<Comment> comments){
        this.name=name;
        this.description=description;
        this.rateAcum=rate;
        this.sellers=sellers;
        this.photo=photo;
        this.comments=comments;
        this.id=id;

    }

    @Column(name="name",nullable = false,length = 100)
    public String getName() {

        return name;
    }
    @Column(name="description",nullable = false,length = 300)
    public String getDescription()
    {
        return description;
    }
    @Column(name="rate",nullable = false,length = 150)

    @OneToMany(cascade=ALL)
    @JoinColumn(name="Sellerid", referencedColumnName="id", nullable=false,insertable = false, updatable = false)
    public List<Seller> getSellers()
    {

        return sellers;
    }
    @Column(name="photo",nullable = false,length = 150)
    public String getPhoto()
    {

        return photo;
    }
    @OneToMany(cascade=ALL)
    @JoinColumn(name="Gameid", referencedColumnName="id", nullable=false,insertable=false, updatable=false)
    public List<Comment>  getComments() {
        return comments;
    }
    @Id
    @Column(name="id",nullable = false,length = 150)
    public long  getId() {

        return id;
    }

    public void setName(String name) {
        this.name=name;
    }
    public void setDescription(String description) {

        this.description=description;
    }

    public void setRate(int rate) {

        this.rateAcum=rate;
    }
    public void setSellers(List<Seller>  sellers) {

        this.sellers=sellers;
    }
    public void setPhoto(String photo) {

        this.photo=photo;
    }
    public void setId(int id){

        this.id=id;
    }
    public void setComments(String content,String user, int rate, int id) {
        List<Comment> commentsAll= getComments();
        Comment c=new Comment(content,user,commentsAll.size()+1,rate);
        commentsAll.add(c);

    }
    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
    public int getRate(){
        int rate=0;

        for(int i=0;i<comments.size();i++){
            rate=comments.get(i).getRate();

        }
        return rate/comments.size();

    }
}
