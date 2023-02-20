package com.bridgelabz;

import java.util.Scanner;

public class AddressBookMain {
    static Scanner scanner=new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to AddressBook System on Master Branch");
        AddressBookMethods addressBookMethods = new AddressBookMethods();
        addressBookMethods.newContact();
        addressBookMethods.newContact();

        MultipleAddressBook obj = new MultipleAddressBook();

        while (true) {
            System.out.println("Enter \n 1. Add new AddressBook\n 2.Add Contact in AddressBook\n" +
                    "3.edit the contact in AddressBook \n 4.delete the contact in AddressBook \n 5.delete the AddressBook \n"
                    + "6.Print the AddressBook\n 7. Print contact in AddressBook\n 0.To exit");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    obj.addAddressBook();
                    break;
                case 2:
                    obj.addContact();
                    break;
                case 3:
                    obj.editContactInBook();
                    break;
                case 4:
                    obj.deleteAddressBok();
                    ;
                    break;
                case 5:
                    obj.deleteAddressBok();
                    break;
                case 6:
                    obj.printContactsInBook();
                    break;
                case 7:
                    obj.PrintBook();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Enter the wrong Input");


            }

            System.out.println(addressBookMethods.list);

            System.out.println("If you want to edit any contact press 1");
            System.out.println("If you want to delete any contact press 2");
            int check = scanner.nextInt();
            if (check == 1) {
                addressBookMethods.editContact();

            } else if (check == 2) {
                addressBookMethods.deleteContact();

            } else {
                System.out.println("Thanks for using this address-book");
            }
            System.out.println(addressBookMethods.list);


        }
    }
}
