package com.albuquerque.sgaapi.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class NeedyPoint {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    public String description;

    @OneToOne(cascade = CascadeType.REMOVE)
    public Address address;

    public String obs;
}
