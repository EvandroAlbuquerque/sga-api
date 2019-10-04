package com.albuquerque.sgaapi.entities.donation;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Setter
@Entity
public class HygieneProduct extends Donation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
}
