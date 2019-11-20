package com.albuquerque.sgaapi.entities;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.Embeddable;

@Getter
@Setter
@Embeddable
@RequiredArgsConstructor
public class Contact {

    public String email;
    public String phone;
}
