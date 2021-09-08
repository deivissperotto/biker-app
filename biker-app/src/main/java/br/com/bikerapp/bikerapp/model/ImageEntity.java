package br.com.bikerapp.bikerapp.model;

import javax.persistence.Entity;
import java.net.URI;

@Entity
public class ImageEntity {

    private String imageName;
    private URI imageReference;
}
