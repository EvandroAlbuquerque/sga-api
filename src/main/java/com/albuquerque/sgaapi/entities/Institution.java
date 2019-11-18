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

    public String initials;

    public String description;

    @OneToOne
    public Volunteer responsible;

    @Embedded
    public Address address;

    @Embedded
    public Contact contact;
}
