package com.lambdaschool.javapuppies;

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;

@Data
@Entity
public class Dog
{
    private @Id @GeneratedValue Long id;
    private String breedName;
    private int weight;
    private boolean isAPTsuitable;

    public Dog(){}

    public Dog(String breedName, int weight, boolean isAPTsuitable) {
        this.breedName = breedName;
        this.weight = weight;
        this.isAPTsuitable = isAPTsuitable;
    }


}
