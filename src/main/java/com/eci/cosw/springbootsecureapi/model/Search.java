package com.eci.cosw.springbootsecureapi.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.sql.Blob;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
@Entity
@Table(name = "ALM_SEARCH" )
public class Search implements java.io.Serializable {

    /**
     *
     */

    private Integer idsearch;
    private Game almGames;


    public Search() {
    }

    public Search(Game almGames) {
        this.almGames = almGames;

    }


    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "idsearch", unique = true, nullable = false)
    public Integer getIdgames() {
        return this.idsearch;
    }

    public void setIdsearch(Integer idsearch) {
        this.idsearch = idsearch;
    }
    @ManyToOne
    @JoinColumn(name = "GAMES_idsearch", nullable = false)
    @Fetch(FetchMode.JOIN)
    public Game getGames() {
        return this.almGames;
    }
    public void setGames(Game almGames) {
        this.almGames = almGames;
    }
}