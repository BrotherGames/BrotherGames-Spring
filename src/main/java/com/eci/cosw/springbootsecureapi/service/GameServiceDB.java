  package com.eci.cosw.springbootsecureapi.service;

  import com.eci.cosw.springbootsecureapi.model.Game;
  import com.eci.cosw.springbootsecureapi.repositories.CommentRepository;
  import com.eci.cosw.springbootsecureapi.repositories.GameRepository;
  import org.springframework.beans.factory.annotation.Autowired;
  import org.springframework.stereotype.Service;

  import java.util.List;

  @Service
  public class GameServiceDB implements GameService{

    @Autowired
      private GameRepository gameRepository;

     @Autowired
      private CommentRepository cmrepo;


     @Autowired
      private UserService userService;


      public List<Game> getAllGame() {
          List<Game> groups = gameRepository.findAll();
          return groups;
      }

      @Override
      public Game getGame(String name) {

          return gameRepository.game(name);
      }

  @Override
      public List<Game> getTopGame() {
          return gameRepository.findAll();
      }

     // @Override
      public void newComment(Game game1, String comment, String user, int id, int rate) {

      }
  }
