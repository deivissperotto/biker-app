package br.com.bikerapp.bikerapp.model;

import javax.persistence.Entity;
import java.util.List;

@Entity
public class PersonEntity {

    private long personId;
    private String name;
    private AddressEntity address;
    private ImageEntity personalPhoto;
    private List<MotorcycleEntity> motorcicly;
    private List<CommentEntity> comments;

}
