package com.transientandjsonproperty.transientandjsonpropertyexample;


import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface repository extends JpaRepository<bean,Integer> {

}
