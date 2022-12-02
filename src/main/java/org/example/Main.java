package org.example;
import java.util.Scanner;

public class Main {
    private static PhoneBook mobilePhone = new PhoneBook();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String args[]) {
        boolean choice = false;

        try {
            while (choice != true) {
                System.out.println("1: Add a contact");
                System.out.println("2: Remove a contact");
                System.out.println("3: Modify a contact");
                System.out.println("4: Print current phone book");
                System.out.println("5: Quit");
                int userInput = scanner.nextInt();
                switch (userInput) {
                    case 1:
                        mobilePhone.addContact();
                        break;
                    case 2:
                        mobilePhone.deleteContact();
                        break;
                    case 3:
                        mobilePhone.updateContact();
                        break;
                    case 4:
                        mobilePhone.printContacts();
                        break;
                    case 5:
                        choice = true;
                }
            }
        } catch (Exception e) {
            System.out.println("An exception caught");
        }
    }
}
