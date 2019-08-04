/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contacts;

/**
 *
 * @author Rohan
 */
import java.util.Scanner;

public class UserInterface {
    private Scanner sc;
    private PhoneBook phoneBook;
    
    public UserInterface() {
        this.sc = new Scanner(System.in);
        this.phoneBook = new PhoneBook();
    }
    
    public void start() {
        printMenu();
        getCommand();
    }
    
     public void printMenu() {
        System.out.println("phone search\n"
                + "available operations:\n"
                + " 1 add a number\n"
                + " 2 search for a number\n"
                + " 3 search for a person by phone number\n"
                + " 4 add an address\n"
                + " 5 search for personal information\n"
                + " 6 delete personal information\n"
                + " 7 filtered listing\n"
                + " x quit");
    }
     
     public void getCommand() {
        while (true) {
            System.out.print("\ncommand: ");
            String command = sc.nextLine();
            
            if (command.equals("x")) {
                break;
            } else if (command.equals("1")) {
                addNumber();
            } else if (command.equals("2")) {
                searchNumber();
            } else if (command.equals("3")) {
                searchPersonByNumber();
            } else if (command.equals("4")) {
                addAddress();
            } else if (command.equals("5")) {
                searchPersonalInfo();
            } else if (command.equals("6")) {
                deletePersonalInfo();
            } else if (command.equals("7")) {
                filteredListing();
            }
        }
    }

    private void addNumber() {
        System.out.print("whose number: ");
        String name = sc.nextLine();
        System.out.print("number: ");
        String number = sc.nextLine();
        
        phoneBook.addNumber(name, number);
    }

    private void searchNumber() {
        System.out.print("whose number: ");
        String name = sc.nextLine();
        
        phoneBook.searchNumber(name);
    }

    private void searchPersonByNumber() {
        System.out.print("number: ");
        String number = sc.nextLine();
        
        phoneBook.searchPersonByNumber(number);
    }

    private void addAddress() {
        System.out.print("whose address: ");
        String name = sc.nextLine();
        System.out.print("street: ");
        String street = sc.nextLine();
        System.out.print("city: ");
        String city = sc.nextLine();
        
        phoneBook.addAddress(name, street, city);
    }

    private void searchPersonalInfo() {
        System.out.print("whose information: ");
        String name = sc.nextLine();
        
        phoneBook.searchPersonalInfo(name);
    }

    private void deletePersonalInfo() {
        System.out.print("whose information: ");
        String name = sc.nextLine();
        
        phoneBook.deletePersonalInfo(name);
    }

    private void filteredListing() {
        System.out.print("keyword (if empty, all listed): ");
        String keyword = sc.nextLine();
        
        phoneBook.filteredListing(keyword);
    }
}
