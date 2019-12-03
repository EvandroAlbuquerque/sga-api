package com.albuquerque.sgaapi.entities;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Getter
@Setter
@Entity
@RequiredArgsConstructor
public class Contact {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    public String email;
    public String phone;
}
