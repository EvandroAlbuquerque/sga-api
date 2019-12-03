package com.albuquerque.sgaapi.entities;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.lang.Nullable;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Getter
@Setter
@Entity
@RequiredArgsConstructor
public class Address {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    public String street;

    public String postalCode;

    @Nullable
    public int number;

    public String district;
}
