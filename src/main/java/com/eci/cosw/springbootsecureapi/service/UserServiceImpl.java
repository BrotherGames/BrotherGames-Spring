package com.eci.cosw.springbootsecureapi.service;

import com.eci.cosw.springbootsecureapi.model.User;
import com.eci.cosw.springbootsecureapi.model.Change;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Santiago Carrillo
 * 8/21/17.
 */
@Service
public class UserServiceImpl
    implements UserService
{

    private List<User> users = new ArrayList<>();


    @Autowired
    public UserServiceImpl()
    {
    }

    @PostConstruct

    private void populateSampleData()

    {

        users.add(0,new User("test@mail.com", "password", "Andres", "Perez","http://farm6.static.flickr.com/5178/5428759578_d6fb2288a4.jpg") ) ;
        this.getUser( 0).setListChange(new Change(1,"","","https://ugc.kn3.net/i/origin/http://www.noticiasdot.com/publicaciones/galerias/Nintendo/2007/NDS_Donkey-Kong-Jungle-Climber-wallpaper/NDS_Donkey-Kong-Jungle-Climber-wallpaper-02.jpg","",true));
        this.getUser( 0).setListChange(new Change(2,"","","https://ugc.kn3.net/i/origin/http://www.noticiasdot.com/publicaciones/galerias/Nintendo/2007/NDS_Donkey-Kong-Jungle-Climber-wallpaper/NDS_Donkey-Kong-Jungle-Climber-wallpaper-02.jpg","",true));

        users.add(1,new User("test@mail.com", "password", "Andres", "Perez","http://farm6.static.flickr.com/5178/5428759578_d6fb2288a4.jpg") ) ;
        this.getUser( 1).setListChange(new Change(1,"","","https://images-eu.ssl-images-amazon.com/images/I/517PZKJ78WL._SY445_.jpg","",true));
        this.getUser( 1).setListChange(new Change(2,"","","https://images-eu.ssl-images-amazon.com/images/I/517PZKJ78WL._SY445_.jpg","",true));




    }


    @Override
    public List<User> getUsers()
    {
        return users;
    }

    @Override
    public User getUser( Integer id )
    {
        return users.get( id );
    }

    @Override
    public User createUser( User user )
    {
        return users.get( 0 );
    }

    @Override
    public User findUserByEmail( String email )
    {
        return users.get( 0 );
    }

    @Override
    public User findUserByEmailAndPassword( String email, String password )
    {
        return users.get( 0 );
    }
    @Override
    public User RegisterUser (User user){
        users.add(user);
        return users.get(users.size()-1);

    }
    
    @Override
    public List<Change> getChangeList(String email) {
        User tmp = this.findUserByEmail( email );
        return tmp.getListChange();
    }

    @Override
    public Change addChange(Change change, String email) {
        User tmp = this.findUserByEmail( email );
        tmp.setListChange(change);
        return tmp.getListChange().get(tmp.getListChange().size() - 1);
    }

    @Override
    public List<Change> getAllChanges(){
        List<Change> tmp = new ArrayList<Change>();
        for (int i = 0; i < this.getUsers().size(); i++) {
            for (int j = 0; j < this.getUsers().get(i).getListChange().size(); j++) {
                System.out.println(this.getUsers().get(i).getListChange().get(j));
                tmp.add(this.getUsers().get(i).getListChange().get(j));

            }
        }
        return tmp;
    }

}
