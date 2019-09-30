package com.albuquerque.sgaapi.entities;

import javax.persistence.Embeddable;

@Embeddable
public class Address {

    public String street;
    public String postalCode;
    public int number;
    public String district;
}
