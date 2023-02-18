package com.bridgelabz;

import java.util.Scanner;

public class AddressBookMain {
    static Scanner scanner=new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to AddressBook System on Master Branch");
        AddressBookMethods addressBookMethods = new AddressBookMethods();
        addressBookMethods.newContact();
        addressBookMethods.newContact();

        System.out.println(addressBookMethods.list);

        System.out.println("If you want to edit any contact press 1");
        System.out.println("If you want to delete any contact press 2");
        int check= scanner.nextInt();
        if(check==1){
            addressBookMethods.editContact();

        }else if(check==2){
            addressBookMethods.deleteContact();

        }else{
            System.out.println("Thanks for using this address-book");
        }
        System.out.println(addressBookMethods.list);



    }
}
