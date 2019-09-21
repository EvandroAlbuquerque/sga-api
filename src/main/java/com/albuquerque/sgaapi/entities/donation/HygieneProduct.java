package com.albuquerque.sgaapi.entities.donation;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Getter
@Setter
@Entity
public class PersonalHygiene extends Donation {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

}
