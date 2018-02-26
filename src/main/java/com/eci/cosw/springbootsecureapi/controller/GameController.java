package com.eci.cosw.springbootsecureapi.controller;

import com.eci.cosw.springbootsecureapi.model.Comment;
import com.eci.cosw.springbootsecureapi.model.Game;
import com.eci.cosw.springbootsecureapi.model.Seller;
import com.eci.cosw.springbootsecureapi.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
    @RequestMapping(value = "searchGame" )
    public class GameController {

        @Autowired
        private GameService gameService;

        @RequestMapping( value = "/games", method = RequestMethod.GET )
        public List<Game> getGames(){
            return gameService.getGames();
        }
        @RequestMapping( value = "/game/{game}", method = RequestMethod.GET )
        public Game getGame(@PathVariable String game){
            return gameService.getGame(game);
        }

        @RequestMapping( value = "/topGames", method = RequestMethod.GET )
        public List<Game> topGames(){
            return gameService.topGames();
        }
        @RequestMapping( value = "/newGame", method = RequestMethod.POST )
        public boolean setNewGame(@RequestBody Game game
        ){
            gameService.createGame(game);
            return true;
        }
        @RequestMapping( value = "/newSeller", method = RequestMethod.POST )
        public boolean setNewSeller(@PathVariable Game game, Seller seller
        ){
            gameService.newSeller(game,seller);
            return true;
        }
        @RequestMapping( value = "/newComment", method = RequestMethod.POST )
        public boolean setNewComment(@PathVariable Game game, Comment comment
        ){
            gameService.newComment(game,comment);
            return true;
        }

    }
}
