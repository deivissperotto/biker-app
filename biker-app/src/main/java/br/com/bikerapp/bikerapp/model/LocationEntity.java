package br.com.bikerapp.bikerapp.model;

import javax.persistence.Entity;
import java.util.Calendar;
import java.util.List;

@Entity
public class LocationEntity {

    private String name;
    private String descripition;
    private int avaliation;
    private AddressEntity addressLocation;
    private Calendar lastUpdate;
    private List<TagsEntity> tags;
    private List<ImageEntity> images;
    private List<PersonEntity> visitors;
    private List<CommentEntity> comments;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescripition() {
        return descripition;
    }

    public void setDescripition(String descripition) {
        this.descripition = descripition;
    }

    public int getAvaliation() {
        return avaliation;
    }

    public void setAvaliation(int avaliation) {
        this.avaliation = avaliation;
    }

    public AddressEntity getAddressLocation() {
        return addressLocation;
    }

    public void setAddressLocation(AddressEntity addressLocation) {
        this.addressLocation = addressLocation;
    }

    public Calendar getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Calendar lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public List<TagsEntity> getTags() {
        return tags;
    }

    public void setTags(List<TagsEntity> tags) {
        this.tags = tags;
    }

    public List<ImageEntity> getImages() {
        return images;
    }

    public void setImages(List<ImageEntity> images) {
        this.images = images;
    }

    public List<PersonEntity> getVisitors() {
        return visitors;
    }

    public void setVisitors(List<PersonEntity> visitors) {
        this.visitors = visitors;
    }

    public List<CommentEntity> getComments() {
        return comments;
    }

    public void setComments(List<CommentEntity> comments) {
        this.comments = comments;
    }
}
