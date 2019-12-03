package com.albuquerque.sgaapi.entities;

import lombok.Getter;
import lombok.Setter;
import org.springframework.lang.Nullable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
@Getter
@Setter
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    public String street;

    public String postalCode;

    @Nullable
    public int number;

    public String district;
}
