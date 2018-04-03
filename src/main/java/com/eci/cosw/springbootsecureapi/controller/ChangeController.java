package com.eci.cosw.springbootsecureapi.controller;

import com.eci.cosw.springbootsecureapi.model.Change;
import com.eci.cosw.springbootsecureapi.service.ChangeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping( "api" )
public class ChangeController {
    @Autowired
    private ChangeService changeService;

    @RequestMapping( value = "/change", method = RequestMethod.GET )
    public List<Change> getChanges(){
        return changeService.getChangeList();

    }

    @RequestMapping( value = "/change", method = RequestMethod.POST )
    public Change setChange(@RequestBody Change change){
        return changeService.addChange(change);
    }



}
