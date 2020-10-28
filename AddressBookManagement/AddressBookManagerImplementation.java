package com.AddressBookManagement;

import java.io.*;
import java.util.Scanner;

public class AddressBookManagerImplementation implements AddressBookManagerInterface {

    @Override
    public void newAddressBook() {
  /*      Scanner sc = new Scanner(System.in);
        FileWriter fo = null;
        try {
            sc = new Scanner(System.in);
            fo = new FileWriter("C:\\Users\\NEHA\\Desktop\\BridgeLabZ\\AddressBook",true);

            System.out.println("Enter Data TO Write into File : ");
            String strData = sc.nextLine();
            BufferedWriter bw = new BufferedWriter(fo);
            PrintWriter pw =new PrintWriter(bw);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("Please Check File Avalability...");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Please Check Data Before Write to File....");
        }
        finally {
            try {
                //fos.close();
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("Please Check File Close Operation....");
            }
        }
    }
*/
    }

        @Override
        public void openAddressBook ()
        {
       // System.out.println("\n" + "WELCOME TO ADDRESS BOOk");


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
