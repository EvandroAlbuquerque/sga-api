package com.albuquerque.sgaapi.entities.donation;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

enum Gender {
    MALE, FEMALE, UNDEFINED
}

@Entity
@Getter
@Setter
public class Clothes extends Donation {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    public String size;
    public Gender gender;

}
