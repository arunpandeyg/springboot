package org.practice;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "Student-address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "address-id")
    private  int addId;
    @Column(length =50,  name = "STREET")
    private String street;
    @Column(length = 100, name = "City")
    private String city;
    @Column(name = "is-open")
    private boolean isOpen;
    @Transient
    private double x;
    @Column(name = "added-date")
    @Temporal(TemporalType.DATE)
    private Date addedDate;
    @Lob
    private byte [] image;

    public Address() {
        super();
    }

    public Address(int addId, String street, String city, boolean isOpen, double x, Date addedDate, byte[] image) {
        this.addId = addId;
        this.street = street;
        this.city = city;
        this.isOpen = isOpen;
        this.x = x;
        this.addedDate = addedDate;
        this.image = image;
    }

    public int getAddId() {
        return addId;
    }

    public void setAddId(int addId) {
        this.addId = addId;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public Date getAddedDate() {
        return addedDate;
    }

    public void setAddedDate(Date addedDate) {
        this.addedDate = addedDate;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }
}
