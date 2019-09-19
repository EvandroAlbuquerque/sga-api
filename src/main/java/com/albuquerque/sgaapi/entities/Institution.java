package com.albuquerque.sgaapi.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@Getter
@Setter
public class Institution {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    public String name;
    public Address address;
    public Contact contact;
}
