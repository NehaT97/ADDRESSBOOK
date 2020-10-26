package com.AddressBookManagement;

public interface AddressBookManagerInterface {
    public void newAddressBook();
    public void openAddressBook(String a,String b);
    public void saveAddressBook();
    public void saveAsAddressBook();
    public void closeAddressBook();
    public void quit();
    void displayBook();
}
