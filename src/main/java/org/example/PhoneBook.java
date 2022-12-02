package org.example;
import java.util.ArrayList;
import java.util.Scanner;

public class PhoneBook {
    //creating object for phonebook class
     private static PhoneBook mobilephone = new PhoneBook();
     private static Scanner scanner = new Scanner(System.in);

     //creating an array list for contacts
     private static ArrayList<Contact> phoneBook = new ArrayList<Contact>();
     private static String name;
     private static String phoneNumber;

     //method to display contacts
     public void printContacts() {
         if (phoneBook.size() == 0) {
             System.out.println("Your phone book is empty");
         }
         else {
             System.out.println("Your current phone book has the following entries.");
             for (int i = 0; i < phoneBook.size(); i++) {
                 System.out.println(i + 1 + ". Name:" + phoneBook.get(i).getName() + " PH# " + phoneBook.get(i).getPhoneNumber());
             }
         }
     }

     //method for adding new contact to phonebook
     public void addContact() {
         System.out.println("Enter the name that you would like to add");
         name = scanner.nextLine();
         System.out.println("Enter the phone number for this contact");
         phoneNumber = scanner.nextLine();
         Contact contacts = new Contact(name,phoneNumber);
         phoneBook.add(contacts);
     }

     //method for deleting contact from phonebook
    public void deleteContact() {
         System.out.println("Enter the contact that you would like to delete");
         name = scanner.nextLine();
         for (int i=0; i<phoneBook.size(); i++) {
             if (phoneBook.get(i).getName().equals(name)) {
                 phoneBook.remove(i);
             }
         }
     }

     //method for updating phonebook
     public void updateContact() {
         System.out.println("Enter the item you want to update");
         name = scanner.nextLine();
         for (int i = 0; i < phoneBook.size(); i++) {
             if (phoneBook.get(i).getName().equals(name)) {
                 System.out.println("Enter the contact name you want to edit");
                 name = scanner.nextLine();
                 System.out.println("Enter this new contact's new phone number");
                 phoneNumber = scanner.nextLine();
                 Contact contacts = new Contact(name, phoneNumber);
                 phoneBook.set(i, contacts);
             }
         }
     }
}

