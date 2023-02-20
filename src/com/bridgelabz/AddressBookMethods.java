package com.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookMethods {
    Scanner sc =new Scanner(System.in);

    ArrayList<Contact>list= new ArrayList<>();
    String name;
    public void duplicateContactCheck(){
        System.out.println("Enter first name");
        name = sc.nextLine();
        for(Contact cc : list){
            if(cc.getFirstName().equals(name)){
                System.out.println("contact already exist");
                return;
            }
        }
        newContact();
    }
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
    public void editContact(){
        System.out.println("Enter first name to edit the contact");
        String name = sc.nextLine();

        for (Contact con : list){
            if(con.getFirstName().equals(name)){


                System.out.println("Which details you want to edit");
                System.out.println("press 1 for first name");
                System.out.println("Press 2 for last name");
                System.out.println("Press 3 for address");
                System.out.println("Press 4 for city");
                System.out.println("Press 5 for state");
                System.out.println("Press 6 for zip");
                String choice = sc.nextLine();

                switch (choice){
                    case "1" :
                        System.out.println("Enter new first name");
                        con.setFirstName(sc.nextLine());
                        break;

                    case "2" :
                        System.out.println("Enter new last name");
                        con.setLastName(sc.nextLine());
                        break;

                    case "3" :
                        System.out.println("Enter new address");
                        con.setAddress(sc.nextLine());
                        break;

                    case "4" :
                        System.out.println("Enter new city");
                        con.setCity(sc.nextLine());
                        break;

                    case "5" :
                        System.out.println("Enter new state");
                        con.setState(sc.nextLine());
                        break;

                    case "6" :
                        System.out.println("Enter new zip");
                        con.setZip(sc.nextLine());
                        break;

                    default:
                        System.out.println("Please make a valid choice");

                }

                }else{
                System.out.println(name+"not found in the address-book");



            }
        }
    }
    public void deleteContact(){
        System.out.println("Enter the first name to delete contact");
        String name = sc.nextLine();
        int index =0;
        for(Contact con:list){
            if(con.getFirstName().equals(name)){
                list.remove(index);
                break;
            }
            index++;
        }
    }


}
