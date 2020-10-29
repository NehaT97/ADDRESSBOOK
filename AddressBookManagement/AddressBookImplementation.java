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
            System.out.println();
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
    //Edit Person Details
    public void editPerson()
    {
            Scanner sc1=new Scanner(System.in);
            System.out.println("\nEnter the FirstName And LastName To Find Records.\nFirstName");
                String firstName=sc1.nextLine();
                System.out.println("\nLastName");
                String lastName = sc1.nextLine();
                int loop=1;
                for (Person person : addressbook)
                {
                    if (person.getFirstname().equals(firstName)  &&  person.getLastname().equals(lastName))
                    {
                        System.out.println("\nData Found as per match!!!");
                        System.out.println( person.toString());
                          while (loop==1)
                          {
                                    System.out.println("\n\n Enter what field you want to edit(address/contact/quit) : ");
                                    String field = sc1.nextLine(); //taken input as address or contact

                                    if (field.equals("address")) {
                                        System.out.println("\n Enter Address : To Edit ");

                                        System.out.print("\b\n City : ");
                                        String city = sc1.nextLine();

                                        System.out.print("\b\n State : ");
                                        String state = sc1.nextLine();

                                        System.out.print("\n ZipCode: ");
                                        int zip = sc1.nextInt();

                                        //Adding Edited Address Related Data To Address arraylist
                                        Address address = new Address(city, state, zip);
                                        ArrayList<Address> AddressList = new ArrayList<Address>();
                                        AddressList.add(address);
                                        person.setAddress(AddressList); //set edited address
                                        System.out.println("\nAddress Edited Successfully:" +  AddressList);


                                    }

                                    else if (field.equals("contact")) {
                                        System.out.print("\n Enter contact number : ");
                                        String contact = sc1.nextLine();
                                        person.setContactno(contact);
                                        System.out.println("\nContact Edited Successfuly :" + person.toString());

                                    }

                                    else if (field.equals("quit")) {
                                        loop = 0;
                                        System.out.println("\nExit From Edit Functionality");
                                    }

                          }

                    }
                    else
                    {
                        System.out.println("given Wrong Input : Unable to find data!!!!");

                    }
                }
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


    public void display()
    {
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
