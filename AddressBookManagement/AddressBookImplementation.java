package com.AddressBookManagement;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookImplementation  implements AddressBookInterface{

    Scanner sc=new Scanner(System.in);
    public static ArrayList<Person> addressbook = new ArrayList<Person>();

    @Override
    //Person information addded
    public void addPerson()
    {
            System.out.println("Enter the FirstName");
            String firstname = sc.nextLine();

            System.out.println("Enter the LastName");
            String lastname = sc.nextLine();

            System.out.println("Enter the Contact");
            String contactno = sc.nextLine();

            System.out.println("Enter the city");
            String city = sc.nextLine();

            System.out.println("Enter the state");
            String state = sc.nextLine();

            System.out.println("Enter the zip");
            int zip = sc.nextInt();

            //passed arguments to Address class
            Address address=new Address(city,state,zip);
            ArrayList<Address>AddressList = new ArrayList<Address>();
            AddressList.add(address);

            //Passed arguments to Person class
            Person p=new Person(firstname,lastname,contactno,AddressList);
            addressbook.add(p);
           System.out.println("AddressBook Data:" +addressbook);
    }

    @Override
    public void editPerson()
    {
    }

    @Override
    public void deletePerson() {
    }

    @Override
    public void sortByName() {
    }

    @Override
    public void sortByZip() {
    }

    @Override
    public void searchPerson() {
    }


    public void display() {
        System.out.println("\nDISPLAYING ADDRESS BOOK DATA");
        for (int i=0; i<addressbook.size(); i++)
        {
            System.out.println(addressbook.get(i));
        }
    }

    @Override
    public void quit() {

    }
}
