package com.AddressBookManagement;

import java.util.ArrayList;

public class Person {

    private String firstname;
    private String lastname;
    private String contactno;
    private ArrayList<Address> address;

    //constructor

    public Person(String firstname, String lastname, String contactno, ArrayList<Address> address) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.contactno = contactno;
        this.address = address;
    }

    //getter And Setter
    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getContactno() {
        return contactno;
    }

    public void setContactno(String contactno) {
        this.contactno = contactno;
    }

    public ArrayList<Address> getAddress() {
        return address;
    }

    public void setAddress(ArrayList<Address> address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", contactno='" + contactno + '\'' +
                ", address=" + address +
                '}';
    }
}
