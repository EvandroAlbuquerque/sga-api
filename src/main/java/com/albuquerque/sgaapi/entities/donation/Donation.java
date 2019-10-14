package com.albuquerque.sgaapi.entities.donation;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@MappedSuperclass
public abstract class Donation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    public String donationDate;
    public String donatorName;
    public String productName;
    public String description;


}
