package com.sunglowsys.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "Patient")

public class Patient implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private  Long id;

    @Column(name = "first_name",nullable = false)
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "gender")
    private String gender;

    @Column(name = "age")
    private Integer age;

    @Column(name = "mobile")
    private String mobile;

    @Column(name = "nominee")
    private String nominee;

    @Column(name = "bed_number")
    private String bedNumber;

    @Column(name = "room_number")
    private String roomNumber;

    public Patient(){}

    public Patient( String firstName, String lastName, String gender, Integer age, String mobile, String nominee, String bedNumber, String roomNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
        this.mobile = mobile;
        this.nominee = nominee;
        this.bedNumber = bedNumber;
        this.roomNumber = roomNumber;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getNominee() {
        return nominee;
    }

    public void setNominee(String nominee) {
        this.nominee = nominee;
    }

    public String getBedNumber() {
        return bedNumber;
    }

    public void setBedNumber(String bedNumber) {
        this.bedNumber = bedNumber;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Patient patient = (Patient) o;
        return Objects.equals(id, patient.id) && Objects.equals(firstName, patient.firstName) && Objects.equals(lastName, patient.lastName) && Objects.equals(gender, patient.gender) && Objects.equals(age, patient.age) && Objects.equals(mobile, patient.mobile) && Objects.equals(nominee, patient.nominee) && Objects.equals(bedNumber, patient.bedNumber) && Objects.equals(roomNumber, patient.roomNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, gender, age, mobile, nominee, bedNumber, roomNumber);
    }

    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", mobile='" + mobile + '\'' +
                ", nominee='" + nominee + '\'' +
                ", bedNumber='" + bedNumber + '\'' +
                ", roomNumber='" + roomNumber + '\'' +
                '}';
    }
}
