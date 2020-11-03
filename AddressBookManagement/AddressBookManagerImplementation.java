package com.AddressBookManagement;
import java.io.*;
import java.util.Scanner;

public class AddressBookManagerImplementation implements AddressBookManagerInterface
{

        Scanner sc=new Scanner(System.in);
        static String bookname;


    @Override
            public void newAddressBook() throws IOException
            {

                    System.out.println("!!! Create Address Book Here !!!");
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
                  System.out.println("\n" + "!!! You Can Opened Any Address Book !!!");
                  System.out.println("\nAll AddressBook List");
                  File file=new File("C:\\Users\\NEHA\\Desktop\\BridgeLabZ\\AddressBook\\");
                  File[] filelist = file.listFiles();
                    for (File f : filelist)
                    {
                        if (f.getName().contains(".csv")) //To get only CSV files
                            System.out.println(f.getName());
                    }


                    //logic for to open addressbook
                    System.out.println("\nEnter the addressbook to open");
                    bookname=sc.nextLine();
                    boolean filefound=false;
                    for (File f : filelist)
                    {
                        if (f.getName().equals(bookname)){
                            filefound = true;
                            System.out.println("[" +f.getName()+ " is Opened ]");
                        }
                    }
                    if (filefound==false){
                        System.out.println("\n!! File Not found.First Create it !!");
                    }

            }

            @Override
            public void saveAddressBook ()
            {
                 System.out.println();
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
