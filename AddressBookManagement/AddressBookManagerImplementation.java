package com.AddressBookManagement;
import java.io.*;
import java.util.Scanner;

public class AddressBookManagerImplementation implements AddressBookManagerInterface
{

        Scanner sc;

        @Override
        public void newAddressBook() throws IOException
        {

                System.out.println("!!! Create Address Book Here !!!");
                sc = new Scanner(System.in);
                System.out.println("\nEnter Address Book Name");
                String filename = sc.nextLine();
                try {

                    File object = new File("C:\\Users\\NEHA\\Desktop\\BridgeLabZ\\AddressBook\\" + filename + ".csv");
                    if (object.createNewFile())
                    {
                        System.out.println("\nAddress Book is created : " + object.getName());
                        //writeCSV(); //To write data in CSV file
                    }

                    else {
                        System.out.println("\nAddress Book Already Exist");
                    }

                } catch (IOException e) {
                    System.out.println("\nError Occurred During Creation");
                    e.printStackTrace();
                }

        }

        
            @Override
            public void openAddressBook()
            {

            }

            @Override
            public void saveAddressBook ()
            {

            }

            @Override
            public void saveAsAddressBook ()
            {

            }

            @Override
            public void closeAddressBook ()
            {

            }

            @Override
            public void quit ()
            {

            }

            @Override
            public void displayBook ()
            {

            }
}
