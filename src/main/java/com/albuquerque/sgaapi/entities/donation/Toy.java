package com.albuquerque.sgaapi.entities.donation;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

enum AgeGroup {
    YEARS_0_TO_3, YEARS_3_TO_5, YEARS_5_TO_8
}

@Getter
@Setter
@Entity
public class Toy extends Donation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    public AgeGroup age;
}
