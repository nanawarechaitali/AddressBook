package com.bridgelabz;

public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome to AddressBook System on Master Branch");
        AddressBookMethods addressBookMethods = new AddressBookMethods();
        addressBookMethods.newContact();
        addressBookMethods.newContact();

        System.out.println(addressBookMethods.list);


    }
}
