package com.albuquerque.sgaapi.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class Action {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    public Volunteer responsible;
    public Address meetingPlace;
    public LocalDateTime hour;
    public String obs;
    public boolean current = true;
}
