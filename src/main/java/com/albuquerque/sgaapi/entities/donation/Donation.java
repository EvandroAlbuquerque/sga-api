package com.albuquerque.sgaapi.entities.donation;

import com.albuquerque.sgaapi.entities.Institution;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
//@MappedSuperclass
//public abstract class Donation {
public class Donation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    public String category;
    public String name;
    public String description;

//    public String donationDate;
//    public String donatorName;
//    public String productName;
//    public String description;
//
//    @ManyToOne
//    public Institution forwardedTo;

}
