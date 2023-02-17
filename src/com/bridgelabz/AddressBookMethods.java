package com.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookMethods {
    Scanner sc =new Scanner(System.in);

    ArrayList<Contact>list= new ArrayList<>();
    public void newContact(){
        System.out.println("Enter first name");
        String firstName = sc.nextLine();

        System.out.println("Enter last name");
        String lastName= sc.nextLine();

        System.out.println("Enter address");
        String address = sc.nextLine();

        System.out.println("Enter city");
        String city = sc.nextLine();

        System.out.println("Enter state");
        String state = sc.nextLine();

        System.out.println("Enter zip");
        String zip = sc.nextLine();


        Contact contact= new Contact(firstName,lastName,address,city,state,zip);


        list.add(contact);

    }

}
