package com.albuquerque.sgaapi.entities.donation;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.util.Date;

@Getter
@Setter
@Entity
public class Food extends Donation {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    public Date expiryDate;
}
