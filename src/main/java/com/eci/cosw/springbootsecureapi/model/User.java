package com.eci.cosw.springbootsecureapi.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Santiago Carrillo
 * 8/21/17.
 */


@Entity
@Table(name = "User")
public class User {

    private int  id;

    private String email;

    private String password;

    private String firstname;

    private String lastname;

    private String username;

    private String image;

    private String description;


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
    public User(int id,String email, String password, String name,String lastname, String username, String image, String description) {

        this.email = email;

        this.password = password;

        this.image = image;

        this.firstname = name;

        this.id=id;

        this.lastname = lastname;

        this.description = description;

        this.username = username;

    }

    @Column(name = "description")
    public String getDescription()
    {
        return description;
    }

    public void setDescription( String description )
    {
        this.description = description;
    }


    @Column(name = "id")
    public int getId(){ return id; }

    public void setId(int id ){ this.id = id; }

    @Column(name = "image")
    public String getImage()
    {
        return image;
    }

    public void setImage( String image )
    {
        this.image = image;
    }

    @Id
    public String getEmail()
    {
        return email;
    }

    public void setEmail( String email )
    {
        this.email = email;
    }

    @Column(name = "password")
    public String getPassword()
    {
        return password;
    }

    public void setPassword( String password )
    {
        this.password = password;
    }

    @Column(name = "name")
    public String getFirstname()
    {
        return firstname;
    }

    public void setFirstname( String firstname )
    {
        this.firstname = firstname;
    }

    @Column(name = "lastname")
    public String getLastname()
    {
        return lastname;
    }

    public void setLastname( String lastname )
    {
        this.lastname = lastname;
    }

    @Column(name = "username")
    public String getUsername()
    {
        return username;
    }

    public void setUsername( String username )
    {
        this.username = username;
    }

    @Override
    public String toString()
    {
        return "User{" + "id=" + id + ", email='" + email + '\'' + ", password='" + password + '\'' + ", firstname='"
            + firstname +  ", username='" + username + '\'' + ", image='" + image + '\'' +'}';
}
}
