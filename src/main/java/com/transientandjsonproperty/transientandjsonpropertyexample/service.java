package com.transientandjsonproperty.transientandjsonpropertyexample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class service {
    @Autowired
    private  repository repository;

    public List<bean> getData(){
        return repository.findAll();
    }


}
