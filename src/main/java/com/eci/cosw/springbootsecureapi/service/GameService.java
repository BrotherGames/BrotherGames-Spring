package com.eci.cosw.springbootsecureapi.service;

import com.eci.cosw.springbootsecureapi.model.Comment;
import com.eci.cosw.springbootsecureapi.model.Game;
import com.eci.cosw.springbootsecureapi.model.Seller;

import java.util.ArrayList;
import java.util.List;

public interface GameService {

        public List<Game> getGames();
        public Game getGame( String name );
        public boolean createGame( Game game );
        public void newSeller(Game game,Seller seller);
        public List<Game> topGames();
        public void newComment(Game game,Comment comment);
}
