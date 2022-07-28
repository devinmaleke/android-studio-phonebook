package com.example.uas;

import java.io.Serializable;

public class Dataset implements Serializable {
    private Integer employeeId;
    private String gender;
    private empName name;
    private location location;
    private String email;
    private Login login;
    private dob dob;
    private registered registered;
    private String phone;
    private String cell;
    private id id;
    private picture picture;
    private String nat;

    public empName getName() {
        return name;
    }

    public void setName(empName name) {
        this.name = name;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }


    public com.example.uas.location getLocation() {
        return location;
    }

    public void setLocation(com.example.uas.location location) {
        this.location = location;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Login getLogin() {
        return login;
    }

    public void setLogin(Login login) {
        this.login = login;
    }

    public com.example.uas.dob getDob() {
        return dob;
    }

    public void setDob(com.example.uas.dob dob) {
        this.dob = dob;
    }

    public com.example.uas.registered getRegistered() {
        return registered;
    }

    public void setRegistered(com.example.uas.registered registered) {
        this.registered = registered;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCell() {
        return cell;
    }

    public void setCell(String cell) {
        this.cell = cell;
    }

    public com.example.uas.id getId() {
        return id;
    }

    public void setId(com.example.uas.id id) {
        this.id = id;
    }

    public com.example.uas.picture getPicture() {
        return picture;
    }

    public void setPicture(com.example.uas.picture picture) {
        this.picture = picture;
    }

    public String getNat() {
        return nat;
    }

    public void setNat(String nat) {
        this.nat = nat;
    }

    @Override
    public String toString() {
        return "Dataset{" +
                "employeeId=" + employeeId +
                ", gender='" + gender + '\'' +
                ", name='" + name + '\'' +
                ", location=" + location +
                ", email='" + email + '\'' +
                ", login=" + login +
                ", dob=" + dob +
                ", registered=" + registered +
                ", phone='" + phone + '\'' +
                ", cell='" + cell + '\'' +
                ", id=" + id +
                ", picture=" + picture +
                ", nat='" + nat + '\'' +
                '}';
    }
}
