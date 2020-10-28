package com.AddressBookManagement;
import java.util.Scanner;

public class getRun {

    public static void main(String args[]) {
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
                        System.out.println("\n" + "WELCOME TO ADDRESS BOOk");
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

                        switch (ch1) {
                            case 1:
                                addressBook.addPerson();
                                break;

                            case 2:
                                addressBook.editPerson();
                                break;

                            case 3:
                                addressBook.deletePerson();
                                break;

                            case 4:
                                addressBook.sortByName();
                                break;

                            case 5:
                                addressBook.sortByZip();
                                break;

                            case 6:
                                addressBook.searchPerson();
                                break;

                            case 7:
                                addressBook.display();
                                break;

                            case 8:
                                value = 0; //main menu

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