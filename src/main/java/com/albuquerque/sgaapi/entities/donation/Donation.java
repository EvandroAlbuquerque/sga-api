package com.albuquerque.sgaapi.entities.donation;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import java.util.Date;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Donation {

    public Date donationDate;
    public String donatorName;
    public String productName;
    public String description;


}
