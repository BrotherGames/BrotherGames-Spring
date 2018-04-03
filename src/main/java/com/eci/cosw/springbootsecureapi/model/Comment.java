/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eci.cosw.springbootsecureapi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Kazu
 */
@Entity
@Table(name = "Comment" )
public class Comment {

    private String content;
    private String user;
    private int rate;
    private long id;

    public Comment() {

    }

    public Comment(String content,  String user, long id,int rate) {
        this.content = content;
        this.user = user;
        this.id = id;
        this.rate=rate;
    }
    @Column(name = "content", nullable = false, length = 1000)
    public String getContenido() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
    @Column(name = "rate", nullable = false, length = 1000)
    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    @Column(name = "user", nullable = false, length = 100)
    public String getUser() {
        return user;
    }

    public void setUsuario(String usuario) {
        this.user = usuario;
    }

    @Id
    @Column(name = "id", nullable = false, length = 100)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

}
