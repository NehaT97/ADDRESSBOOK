package com.AddressBookManagement;

public class Address {
    String city;
    String state;
    int zip;

    //constructor
    public Address(String city, String state, int zip) {
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    //getter
    public String getCity()
    {
        return city;
    }

    public String getState()
    {
        return state;
    }

    public int getZip()
    {
        return zip;
    }

    //setter

    public void setCity(String city)
    {
        this.city = city;
    }

    public void setState(String state)
    {
        this.state = state;
    }

    public void setZip(int zip)
    {
        this.zip = zip;
    }


    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zip=" + zip +
                '}';
    }
}
