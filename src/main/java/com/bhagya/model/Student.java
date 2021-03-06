package com.bhagya.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by bhagya on 7/11/17.
 */
@Entity
@Table(name = "STUDENT")
public class Student {
    @Id
    @GeneratedValue
    @Column(name = "studentId")
    private int studentId;
    @Column(name = "studentName")
    private String studentName;
    @Column(name = "studentMobile")
    private String studentMobile;
    @OneToMany(fetch = FetchType.EAGER, cascade = {CascadeType.ALL})
    @JoinColumn
    private List<Address> addresses = new ArrayList<Address>();

//getters
    public int getStudentId() {
        return studentId;
    }

    public String getStudentMobile() {
        return studentMobile;
    }

    public String getStudentName() {
        return studentName;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    //setters
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setStudentMobile(String studentMobile) {
        this.studentMobile = studentMobile;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

//    public void setAddresses(List<Address> addresses) {
//        for (Address address:addresses){
//            address.setStudent(this);
//        }
//        this.addresses=addresses;
//
//    }

}
