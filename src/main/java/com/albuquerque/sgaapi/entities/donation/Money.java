package com.albuquerque.sgaapi.entities.donation;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Digits;
import java.math.BigDecimal;

@Getter
@Setter
@Entity
public class Money extends Donation{

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @Column(nullable = false, precision = 7, scale = 2)
    @Digits(integer = 7, fraction = 2)
    public BigDecimal value;

}
