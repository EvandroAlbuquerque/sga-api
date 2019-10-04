package com.albuquerque.sgaapi.entities;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.lang.Nullable;

import javax.persistence.Embeddable;

@Getter
@Setter
@Embeddable
@RequiredArgsConstructor
public class Address {

    public String street;

    public String postalCode;

    @Nullable
    public int number;

    public String district;
}
