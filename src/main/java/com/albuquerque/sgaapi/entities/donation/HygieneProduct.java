package com.albuquerque.sgaapi.entities.donation;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

enum HygieneProductType {
    PERSONAL, GENERAL
}

@Getter
@Setter
@Entity
public class HygieneProduct extends Donation {

    public HygieneProductType type;
}
