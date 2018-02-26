package com.eci.cosw.springbootsecureapi.service;

import com.eci.cosw.springbootsecureapi.model.Comment;
import com.eci.cosw.springbootsecureapi.model.Game;
import com.eci.cosw.springbootsecureapi.model.Seller;
import com.eci.cosw.springbootsecureapi.model.User;

public interface GameService {

        List<Game> getGames();
        public Game getGame( String name );
        public boolean createGame( Game game );
        public void newSeller(Game game,Seller seller);
        public ArrayList<Game> topGames();
        public void newComment(Game game,Comment comment);
}
