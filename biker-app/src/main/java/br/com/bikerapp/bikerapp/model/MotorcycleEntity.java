package br.com.bikerapp.bikerapp.model;

import javax.persistence.Entity;

@Entity
public class MotorcycleEntity {

    private String brand;
    private String model;
    private String type; //custom, trail etc
    private String year;
    private double hp;
    private double engineDisplacement;
    private double torque;
    private double consumption;

}
