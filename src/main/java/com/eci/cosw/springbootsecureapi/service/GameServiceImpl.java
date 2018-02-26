package com.eci.cosw.springbootsecureapi.service;

import com.eci.cosw.springbootsecureapi.model.Comment;
import com.eci.cosw.springbootsecureapi.model.Game;
import com.eci.cosw.springbootsecureapi.model.Seller;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class GameServiceImpl implements GameService {

    private List<Game> games;

    @Autowired
    public GameServiceImpl() {

    }
    @java.lang.Override
    public List<Game> getGames() {
        return games;
    }

    @java.lang.Override
    public Game getGame(String name
    ) {
        Game getGam=null;
        for(int i=0;i<games.size()-1;i++){
          if( games.get(i).getName().equals(name)) getGam= games.get(i);

        }
        return getGam;
    }

    @java.lang.Override
    public boolean createGame(Game game) {
        games.add(game);
        return true;

    }

    @java.lang.Override
    public void newSeller(Game game,Seller seller) {
        List<Seller> s=game.getSellers();
        s.add(seller);
        getGame(game.getName()).setSellers(s);
        //s.add(seller);
        //game.setSellers(s);

    }

    @Override
    public List<Game> topGames() {
        List<Game> newGames=new ArrayList<Game>();
       for(int i=0;i<games.size()-1;i++){
           if(getGames().get(i).getRate()==5) newGames.add(games.get(i));
       }
       return newGames;
    }

    @java.lang.Override
    public void newComment(Game game,Comment comment) {
        List<Comment> c= game.getComments();
        c.add(comment);
        game.setComments(c);
    }
}
