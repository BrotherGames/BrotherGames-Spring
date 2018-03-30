package com.eci.cosw.springbootsecureapi.model;

import java.util.ArrayList;
import java.util.List;
import com.eci.cosw.springbootsecureapi.model.Change;
import com.eci.cosw.springbootsecureapi.model.Requests;

/**
 * @author Santiago Carrillo
 * 8/21/17.
 */
public class User
{

    private long id;

    private String email;

    private String password;

    private String firstname;

    private String lastname;

    private String username;

    private String image;
    
    private List<Change> changes = new ArrayList<Change>();

    private List<Requests> requests = new ArrayList<Requests>();


    public User()
    {
    }

    public User( String email, String password, String firstname, String lastname, String image )
    {
        this.email = email;
        this.password = password;
        this.firstname = firstname;
        this.lastname = lastname;
        this.image = image;

    }


    public long getId()
    {
        return id;
    }

    public void setId( long id )
    {
        this.id = id;
    }
    public String getImage()
    {
        return image;
    }

    public void setImage( String image )
    {
        this.image = image;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail( String email )
    {
        this.email = email;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword( String password )
    {
        this.password = password;
    }

    public String getFirstname()
    {
        return firstname;
    }

    public void setFirstname( String firstname )
    {
        this.firstname = firstname;
    }

    public String getLastname()
    {
        return lastname;
    }


    public void setLastname( String lastname )
    {
        this.lastname = lastname;
    }

    public String getUsername()
    {
        return username;
    }

    public void setUsername( String username )
    {
        this.username = username;
    }
    
    public List<Change> getListChange(){
        return this.changes;
    }
    
    public void setListChange(Change newChange){
        this.changes.add(newChange);
    }

    @Override
    public String toString()
    {
        return "User{" + "id=" + id + ", email='" + email + '\'' + ", password='" + password + '\'' + ", firstname='"
            + firstname + '\'' + '}';
    }

    public List<Requests> getRequests() {
        return requests;
    }

    public void setRequests(Requests newRequests) {
        this.requests.add(newRequests);
    }
}
