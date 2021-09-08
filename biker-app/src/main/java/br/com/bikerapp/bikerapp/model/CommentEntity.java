package br.com.bikerapp.bikerapp.model;

import javax.persistence.Entity;

@Entity
public class CommentEntity {

    private PersonEntity responsible;
    private LocationEntity localationReference;
    private String comment;
}
