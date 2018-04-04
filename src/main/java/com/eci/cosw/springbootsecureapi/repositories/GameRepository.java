package com.eci.cosw.springbootsecureapi.repositories;

import com.eci.cosw.springbootsecureapi.model.Comment;
import com.eci.cosw.springbootsecureapi.model.Game;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface GameRepository extends JpaRepository<Game, Integer> {

    @Query("from Game as g WHERE g.name=?1")
    Game game(String name);
   /* @Query("from Game as g ")
    List<Game> top();*/
  /*  @Query("SELECT * FROM Game g")
    List<Seller> sellers();*/

}