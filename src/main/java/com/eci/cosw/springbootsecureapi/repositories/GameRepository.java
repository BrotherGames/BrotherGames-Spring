package com.eci.cosw.springbootsecureapi.repositories;

import com.eci.cosw.springbootsecureapi.model.Comment;
import com.eci.cosw.springbootsecureapi.model.Game;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface GameRepository extends JpaRepository<Game, Long> {

    @Query("SELECT g FROM Group g WHERE g.nombre=?1")
    Game game(String name);
     @Query("SELECT g FROM Group g ")
    List<Game> topGames();
}