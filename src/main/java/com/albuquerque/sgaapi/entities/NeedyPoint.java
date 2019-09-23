package com.albuquerque.sgaapi.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.util.Set;

@Entity
@Getter
@Setter
public class NeedyPoint {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    public Address address;
    public String description;
    public Set<Needs> mostNeeds;
    public String obs;
}
