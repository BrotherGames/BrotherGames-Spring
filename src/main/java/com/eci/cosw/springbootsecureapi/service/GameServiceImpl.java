package com.eci.cosw.springbootsecureapi.service;

import com.eci.cosw.springbootsecureapi.model.Comment;
import com.eci.cosw.springbootsecureapi.model.Game;
import com.eci.cosw.springbootsecureapi.model.Seller;
import com.eci.cosw.springbootsecureapi.model.Todo;

public class GameServiceImpl implements GameService {

    private List<Game> games = new ArrayList<Game>();

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
          if( games.get(i).name.equals(name)) getGam= games.get(i);

        }
        return getGam;
    }

    @java.lang.Override
    public boolean createGame(Game game) {
        game.add(game);
        return true;

    }

    @java.lang.Override
    public void newSeller(Game game,Seller seller) {
        ArrayList<Seller> s=game.getSellers();
        s.add(seller);
        game.setSellers(s);

    }

    @java.lang.Override
    public ArrayList<Game> topGames() {
        ArrayList<Game> newGames=new ArrayList<Game>();
       for(int i=0;i<games.size()-1;i++){
           if(game.get(i).getRate=5) newGames.add(game.get(i).getRate);

       }
       return newGames;
    }

    @java.lang.Override
    public void newComment(Game game,Comment comment) {
        ArrayList<Comment> c= game.getComments();
        c.add(comment);
        game.setComments(c);
    }
}
