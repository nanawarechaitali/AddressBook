package com.bridgelabz;
import java.util.*;
public class MultipleAddressBook {
    Map<String,AddressBookMethods> addressBookMap = new HashMap<>();
    List<Contact> contacts = new ArrayList<>();
    public void addAddressBook(){
        System.out.println("Enter Name of new Address Book:");
        Scanner scanner = new Scanner(System.in);
        String bookName = scanner.next();
        if(addressBookMap.containsKey(bookName)){
            System.out.println("Address book with this name exists,enter new name");
            addAddressBook();
        }else{
            AddressBookMethods addressBook = new AddressBookMethods();
            addressBookMap.put(bookName,addressBook);
            System.out.println("Address Book" + bookName+"Successfully added!");
        }
    }
    public void addContact(){
        System.out.println("Enter the name of Address book to add the contact");
        Scanner scanner = new Scanner(System.in);
        String newContact = scanner.nextLine();
        AddressBookMethods  addressBook=addressBookMap.get(newContact);
        if(addressBook==null){
            System.out.println("No book found");
        }else{
            addressBookMap.get(newContact).newContact();
        }
    }
    public void editContactInBook(){
        System.out.println("Enter the name of addressbook you want to edit");
        Scanner scanner = new Scanner(System.in);
        String editBookName =scanner.next();
        if(addressBookMap.containsKey(editBookName)){
            addressBookMap.get(editBookName).editContact();
        }else{
            System.out.println("AddressBook doesnt exist,please enter correct name");
            editContactInBook();
        }
    }
    public void deleteAddressBok(){
        System.out.println("Enter name of addressbook you want to delete");
        Scanner scanner = new Scanner(System.in);
        String bookName = scanner.next();
        if(addressBookMap.containsKey(bookName)){
            addressBookMap.remove(bookName);

        }else{
            System.out.println("AddressBook doesnt exist,Please delete the contact in it");
            deleteAddressBok();
        }
    }
    public void PrintBook(){
        System.out.println("This are AddressBooks in Program");
        for(String book:addressBookMap.keySet()){
            System.out.println(book);

        }

    }
    public void printContactsInBook(){
        for(String i : addressBookMap.keySet()){
            System.out.println(i);
            System.out.println(addressBookMap.get(i).list);

        }
        System.out.println(" ");
    }
    public void searchByCity(String city){
        for(String name : addressBookMap.keySet())addressBookMap.get(name).searchByCity(city);

    }
    public void searchState(String state){
        for(String name:addressBookMap.keySet())addressBookMap.get(name).searchByState(state);
    }
}
