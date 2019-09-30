package com.albuquerque.sgaapi.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Institution {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    public String name;

    @Embedded
    public Address address;

    @OneToOne
    public Contact contact;
}
