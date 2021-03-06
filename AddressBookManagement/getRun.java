package com.AddressBookManagement;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.io.IOException;
import java.util.Scanner;

public class getRun {

    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        AddressBookManagerImplementation addressbookmanager = new AddressBookManagerImplementation();
        AddressBookImplementation addressBook = new AddressBookImplementation();

        int loop = 1;
        while (loop == 1)
        {
            System.out.println("***********WELCOME TO ADDRESS BOOK MANAGEMENT*******");
            System.out.println("\n" + "ADDRESS BOOK MENU" + "\n" + "1].create address Book" +
                    "\n" + "2].open Existing address book " +
                    "\n" + "3].save address book" +
                    "\n" + "4].save As address book " +
                    "\n" + "5].close address book");

            System.out.println("\nSelect any one choice");
            int choice = sc.nextInt();


            switch (choice) {
                case 1:

                    addressbookmanager.newAddressBook();
                    break;

                case 2:

                        addressbookmanager.openAddressBook();
                        int value = 1;
                        while (value == 1) {
                            System.out.println("\n\n" + "WELCOME TO ADDRESS BOOk");
                            System.out.println("****PERSON DETAILS********");
                            System.out.println("1].Add Person" +
                                    "\n" + "2].Edit Person" +
                                    "\n" + "3].Delete Person" +
                                    "\n" + "4].Sort By Name" +
                                    "\n" + "5].Sort By Zip" +
                                    "\n" + "6].Search Person" +
                                    "\n" + "7].Display" +
                                    "\n" + "8].Quit[Go to Main Menu]");

                            System.out.println("\n" + "Enter the choice:");
                            int ch1 = sc.nextInt();
                            String firstName,lastName ;

                        switch (ch1) {
                            case 1:
                                    System.out.println("WELCOME TO ADDPERSON_OPERATION");
                                    addressBook.addPerson();
                                break;

                            case 2:

                                    Scanner sc1=new Scanner(System.in);
                                    System.out.println("WELCOME TO EDIT_OPERATION");
                                    addressBook.editPerson();

                                    //calling display function
                                    System.out.println("You want to go to Display Menu to See the Changes In AddressBook(Yes/No)");
                                    String input = sc1.nextLine();
                                    if (input.equals("yes"))
                                    {
                                        addressBook.display();
                                    }

                                break;

                            case 3:
                                    System.out.println("WELCOME TO DELETE_OPERATION");
                                    addressBook.deletePerson();
                                    break;

                            case 4:
                                    System.out.println("WELCOME TO SORTING OPERATION(BYNAME)");
                                    addressBook.sortByName();
                                    break;

                            case 5:

                                    System.out.println("WELCOME TO SORTING OPERATION(BYZIP)");
                                    addressBook.sortByZip();
                                    break;

                            case 6:
                                    System.out.println("WELCOME TO SEARCH OPERATION");
                                    addressBook.searchPerson();
                                    break;

                            case 7:
                                    System.out.println("WELCOME TO DISPLAY");
                                    addressBook.display();
                                    break;

                            case 8:
                                    value = 0; // QUIT/main menu

                            default:
                                    System.out.println("Back To Main Menu : Wrong Choice!!!");

                        }
                    }
                    break;

                case 3:
                    addressbookmanager.saveAddressBook();
                    break;

                case 4:
                    addressbookmanager.saveAsAddressBook();
                    break;

                case 5:
                    addressbookmanager.closeAddressBook();
                    break;

                case 6:
                    loop = 0;

                default:
                    System.out.println(" Exit From Main Menu : Wrong Choice!!!");
            }


        }
    }
}
