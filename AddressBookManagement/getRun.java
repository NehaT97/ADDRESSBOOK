package com.AddressBookManagement;

import java.util.Random;
import java.util.Scanner;

public class getRun {



    public static void main(String args[]) {
        AddressBookManagerImplementation a1 = new AddressBookManagerImplementation();
        AddressBookImplementation a2 = new AddressBookImplementation();
        Scanner sc = new Scanner(System.in);

        while(true)
        {
            System.out.println("***********WELCOME TO ADDRESS BOOK MANAGEMENT*******");
            System.out.println("Address Book" +"1].create address Book" +
                    "2].open Existing address book " +
                    "3].save address book" +
                    "4].save As address book " +
                    "5].close address book" );

            System.out.println("Select any one choice");
            int choice=sc.nextInt();
            String firstname,lastname;

            switch (choice)
            {
                case 1: a1.newAddressBook();
                        a1.displayBook();
                break;

                case 2:
                        while(true) {
                            System.out.println("WELCOME TO ADDRESS BOOk");
                            
                            System.out.println("****MENU********");
                            System.out.println("1].Add Person" +
                                    "2].Edit Person" +
                                    "3].Delete Person" +
                                    "4].Sort By Name" +
                                    "5].Sort By Zip" +
                                    "6].Search Person" +
                                    "7].Display" +
                                    "8].Quit[Go to Main Menu]");

                            System.out.println("Enter the choice:");
                            int ch = sc.nextInt();
                            switch(ch)
                            {
                                case 1: a2.addPerson();
                                break;

                                case 2: a2.editPerson();
                                break;

                                case 3: a2.deletePerson();
                                break;

                                case 4: a2.sortByName();
                                break;

                                case 5: a2.sortByZip();
                                break;

                                case 6: a2.searchPerson();
                                break;

                                case 7: a2.display();
                                break;

                                case 8: return;

                            }
                            break;
                        }


                case 3: a1.saveAddressBook();
                break;

                case 4: a1.saveAsAddressBook();
                break;

                case 5: a1.closeAddressBook();
                break;

                case 6: a1.quit();
                break;

                default:
                    System.out.println("Enter Wrong Choice");
            }




        }
    }
}