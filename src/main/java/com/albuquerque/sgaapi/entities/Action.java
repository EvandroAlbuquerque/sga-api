package com.albuquerque.sgaapi.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Action {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @ManyToOne
    public Volunteer responsible;

    @Embedded
    public Address place;

    public String description;

    public String hour;

    public String obs;

    public boolean scheduled = true;
}
