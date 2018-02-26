package com.eci.cosw.springbootsecureapi.service;

import com.eci.cosw.springbootsecureapi.model.Comment;
import com.eci.cosw.springbootsecureapi.model.Game;
import com.eci.cosw.springbootsecureapi.model.Seller;
import com.eci.cosw.springbootsecureapi.model.User;

public interface GameService {

        List<Game> getGames();
        Game getGame( String nombre );
        Game createGame( Game game );
        Game newSeller(Seller seller);
        Game topGames();
        Game newComment(Comment comment);
}
