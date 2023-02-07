package com.transientandjsonproperty.transientandjsonpropertyexample;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;
import lombok.Data;

@Entity
@Data
public class bean {

    @Id
    private int id;
    private String name;

    @JsonProperty("Age") // JSON Property Annotation Example-Here the age will be populated as -"Age" not "age"
    private String age;
    @Transient   //Transient Annotation example - Here "anything" attribute will not get saved into the table.["anything" field is not visible to the hibernate]
    private String anything;

}
