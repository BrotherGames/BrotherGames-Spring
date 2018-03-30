package com.eci.cosw.springbootsecureapi.controller;

import java.util.Date;
import java.util.List;
import javax.servlet.ServletException;

import com.eci.cosw.springbootsecureapi.model.Change;
import com.eci.cosw.springbootsecureapi.model.Requests;
import com.eci.cosw.springbootsecureapi.model.User;
import com.eci.cosw.springbootsecureapi.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

/**
 * @author Santiago Carrillo
 * 8/21/17.
 */
@RestController
@RequestMapping( "user" )
public class UserController
{

    @Autowired
    private UserService userService;

    @RequestMapping( value = "/items", method = RequestMethod.GET )
    public List<User> getUsers(){
        return userService.getUsers();
    }
    @RequestMapping( value = "/items", method = RequestMethod.POST )
    public User setTodo(@RequestBody User user){
        return userService.RegisterUser(user);
    }

    @RequestMapping( value = "/login", method = RequestMethod.POST )
    public Token login( @RequestBody User login )
        throws ServletException
    {

        String jwtToken = "";

        if ( login.getUsername() == null || login.getPassword() == null )
        {
            throw new ServletException( "Please fill in username and password" );
        }

        String username = login.getUsername();
        String password = login.getPassword();

        User user = userService.getUser(0);

        if ( user == null )
        {
            throw new ServletException( "User username not found." );
        }

        String pwd = user.getPassword();

        if ( !password.equals( pwd ) )
        {
            throw new ServletException( "Invalid login. Please check your name and password." );
        }

        jwtToken = Jwts.builder().setSubject( username ).claim( "roles", "user" ).setIssuedAt( new Date() ).signWith(
            SignatureAlgorithm.HS256, "secretkey" ).compact();

        return new Token( jwtToken );
    }

    public class Token
    {

        String access_token;


        public Token( String access_token )
        {
            this.access_token = access_token;
        }


        public String getAccessToken()
        {
            return access_token;
        }

        public void setAccessToken( String access_token )
        {
            this.access_token = access_token;
        }
    }

    @RequestMapping( value = "/changes/{email}", method = RequestMethod.GET )
    public List<Change> getChangeList(@PathVariable(name = "email") String email){
        return userService.getChangeList(email);
    }

    @RequestMapping( value = "/changes/{email}", method = RequestMethod.POST )
    public Change setChange(@RequestBody Change change, @PathVariable(name = "email") String email){
        return userService.addChange(change,email);
    }

    @RequestMapping( value = "/changes", method = RequestMethod.GET )
    public List<Change> getAllChanges(){
        return userService.getAllChanges();
    }

    @RequestMapping( value = "/requests/{email}", method = RequestMethod.GET )
    public List<Requests> getAllRequests(@PathVariable(name = "email") String email){
        return userService.getAllRequests(email);
    }

    @RequestMapping( value = "/requests/{email}", method = RequestMethod.POST )
    public Requests setRecuest(@RequestBody Requests requests, @PathVariable(name = "email") String email){
        return userService.addRequests(requests,email);
    }

}

