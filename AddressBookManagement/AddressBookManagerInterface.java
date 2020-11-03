package com.AddressBookManagement;

import java.io.FileNotFoundException;
import java.io.IOException;

public interface AddressBookManagerInterface {
    public void newAddressBook() throws IOException;
    public void openAddressBook() throws FileNotFoundException;
    public void saveAddressBook();
    public void saveAsAddressBook();
    public void closeAddressBook();
    public void quit();
    public void displayBook();
}
