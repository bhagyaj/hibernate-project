package com.bhagya.model;

import com.bhagya.jView.View;
import com.fasterxml.jackson.annotation.JsonView;

import javax.persistence.*;

/**
 * Created by bhagya on 7/11/17.
 */
@Entity
@Table(name = " Address")
public class Address {
    @Id
    @GeneratedValue
    @Column(name = "id")
//    @JsonView(View.Summary.class)
    private int id;
    @Column(name = "addressName")
//    @JsonView(View.Summary.class)
    private String addressName;
    @Column(name = "addressZip")
//    @JsonView(View.Summary.class)
    private  String addressZip;

//    @ManyToOne
//    private Student student;

//    getters

    public int getId() {
        return id;
    }

    public String getAddressName() {
        return addressName;
    }

    public String getAddressZip() {
        return addressZip;
    }

//    public Student getStudent() {
//        return student;
//    }

    //    setters

    public void setAddressName(String addressName) {
        this.addressName = addressName;
    }

    public void setAddressZip(String addressZip) {
        this.addressZip = addressZip;
    }

    public void setId(int id) {
        this.id = id;
    }

//    public void setStudent(Student student) {
//        this.student = student;
//    }
}
