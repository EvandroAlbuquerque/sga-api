package com.albuquerque.sgaapi.entities.donation;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

enum Gender {
    MALE, FEMALE, UNDEFINED
}

enum Size {
    XSMALL, SMALL, MEDIUM, LARGE, XLARGE
}

@Getter
@Setter
@Entity
public class Clothes extends Donation {

    public Size size;
    public Gender gender;

}
