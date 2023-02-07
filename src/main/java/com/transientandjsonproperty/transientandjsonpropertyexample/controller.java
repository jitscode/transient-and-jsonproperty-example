package com.transientandjsonproperty.transientandjsonpropertyexample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class controller {
    @Autowired
    private service service;


    @GetMapping("/get")
    public List<bean> getData(){
        return service.getData();
    }
}
