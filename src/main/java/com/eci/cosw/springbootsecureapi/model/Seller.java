/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eci.cosw.springbootsecureapi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author Kazu
 */
@Entity
@Table(name="Seller")
public class Seller {

        private String price;
        private String link;
        private long idGame;









        public Seller(long idGame, String price, String link){

            this.price=price;
            this.link=link;
            this.idGame=idGame;


        }

    @Column(name = "price", nullable = false, length = 100)
        public String getPrice() {

            return price;
        }
    @Column(name = "idGame", nullable = false, length = 100)
         public long getIdGame() {
         return idGame;
        }


    @Column(name = "link", nullable = false, length = 100)
        public String getLink() {
            return link;
        }
    public void setIdGame(long idGame) {
        this.idGame = idGame;
    }
                public void setPrice(String price ) {
            this.price=price;
        }
        public void setLink(String link) {
            this.link=link;
        }
       


}
