package com.eci.cosw.springbootsecureapi.repositories;

import com.eci.cosw.springbootsecureapi.model.Game;
import com.eci.cosw.springbootsecureapi.model.Seller;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SellerRepository{
        @Query("SELECT g FROM Group g WHERE g.nombre=?1")
        List<Seller> sellers(String name);
}