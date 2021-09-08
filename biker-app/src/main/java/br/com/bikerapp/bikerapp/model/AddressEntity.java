package br.com.bikerapp.bikerapp.model;

import javax.persistence.Entity;

@Entity
public class AddressEntity {

    private String street;
    private String addressComplement;
    private String city;
    private String us;
    private String country;
    private String zipCode;
    private int number;
}
