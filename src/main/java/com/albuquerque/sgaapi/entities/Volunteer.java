package com.albuquerque.sgaapi.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Volunteer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    public String name;

    @OneToOne(cascade = CascadeType.REMOVE)
    public Address address;

    @OneToOne(cascade = CascadeType.REMOVE)
    public Contact contact;
}

