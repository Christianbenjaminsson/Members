package com.example.members.controller;

import com.example.members.model.ManageMembers;

import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
    Scanner scanner = new Scanner(System.in);
    boolean quit = false;

    ManageMembers manageMembers = new ManageMembers("Anders", "Larsson", "Junibacken",
            7, 12345, "Stockholm", 0701234567);
    private final ArrayList<ManageMembers> listOfMembers = new ArrayList<>();

    public void start() {
        while (!quit) {
            System.out.println(printMenu());
            System.out.print("\nChoose alternative: ");
            int userInput = scanner.nextInt();
            scanner.nextLine();

            switch (userInput) {
                case 1:
                    addNewMember();
                    break;
                case 2:
                    changeMemberDetails();
                    break;
                case 3:
                    removeMemberFromDatabase();
                    break;
                case 4:
                    viewListSavedMemberDetails();
                    break;
                case 5:
                    printMenu();
                    break;
                case 6:
                    quit = true;
            }
        }
    }

    public String printMenu () {
        return
                "\nMain menu:" +
                        "\n 1. Add new member." +
                        "\n 2. Change member details." +
                        "\n 3. Remove member." +
                        "\n 4. View member details." +
                        "\n 5. print menu." +
                        "\n 6. Sign out.";
    }

    public void addNewMember() {
        System.out.println("First name:");
        String memberFname = scanner.nextLine();
        System.out.println("Last name:");
        String memberLname = scanner.nextLine();
        System.out.println("Street:");
        String memberStreet = scanner.nextLine();
        System.out.println("Street No:");
        int memberSteetNo = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Postal code:");
        int memberZipCode = scanner.nextInt();
        scanner.nextLine();
        System.out.println("City");
        String memberTown = scanner.nextLine();
        System.out.println("Mobile No");
        int memberPhone = scanner.nextInt();
        scanner.nextLine();
        ManageMembers newMember = ManageMembers.createMember(memberFname, memberLname, memberStreet, memberSteetNo,
                memberZipCode, memberTown, memberPhone);
        listOfMembers.add(newMember);
    }

    public void changeMemberDetails() {
        if (listOfMembers.isEmpty()) {
            System.out.println("There are no registered members\n");
            return;
        }

        viewListSavedMemberDetails();

        System.out.println("Which member do you like to change? ");
        int enterPositionOfSavedMember = Integer.parseInt(scanner.nextLine());
        while ( enterPositionOfSavedMember > listOfMembers.size()) {
            System.out.println("You have entered an invalid position");
            System.out.println("Please enter another number: ");
            enterPositionOfSavedMember = Integer.parseInt(scanner.nextLine());
        }

        System.out.println("\bMenu - change member details" +
                "\n1. Change first name" +
                "\n2. Change last name" +
                "\n3. Change street" +
                "\n4. Change street No" +
                "\n5. Change zip code" +
                "\n6. Change city" +
                "\n7. Change mobile No");
        System.out.println("Enter your choise: ");
        int positionFromMenuChangeMemberDetails = Integer.parseInt(scanner.nextLine());

        switch (positionFromMenuChangeMemberDetails) {
            case 1:
                listOfMembers.get(enterPositionOfSavedMember).setMemberFirstName(setNewFirstNameForSavedMember());
                break;
            case 2:
                listOfMembers.get(enterPositionOfSavedMember).setMemberLastName(setNewLastNameForSavedMember());
                break;
            case 3:
                listOfMembers.get(enterPositionOfSavedMember).setMemberStreet(setNewStreetForSavedMember());
                listOfMembers.add(listOfMembers.get(enterPositionOfSavedMember));
                break;
            case 4:
                listOfMembers.get(enterPositionOfSavedMember).setMemberStreetNumber(setNewStreetNumberForSavedMember());
                listOfMembers.add(listOfMembers.get(enterPositionOfSavedMember));
            case 5:
                listOfMembers.get(enterPositionOfSavedMember).setMemberZipCode(setNewZipCodeForSavedMember());
                listOfMembers.add(listOfMembers.get(enterPositionOfSavedMember));
                break;
            case 6:
                listOfMembers.get(enterPositionOfSavedMember).setMemberCity(setNewCityForSavedMember());
                listOfMembers.add(listOfMembers.get(enterPositionOfSavedMember));
                break;
            case 7:
                listOfMembers.get(enterPositionOfSavedMember).setMemberMobileNumber(setNewMobileNumberForSavedMember());
                listOfMembers.add(listOfMembers.get(enterPositionOfSavedMember));
        }
    }

    public void removeMemberFromDatabase() {
        System.out.println("Enter position to remove: ");
        int positionToRemove = scanner.nextInt();
        scanner.nextLine();
        for ( int i=0; i<=listOfMembers.size(); i++ ) {
                ManageMembers manageMembers = this.listOfMembers.get(i);
                if (manageMembers.getMemberFirstName().equals(positionToRemove)) {
                    listOfMembers.remove(i);
            } else {
                    System.out.println("Member is not found");
                }
        }
    }

    public void viewListSavedMemberDetails() {
        System.out.println("\nMember List");
        for (int i=0; i<listOfMembers.size(); i++) {
            System.out.println("First name: " +
                    listOfMembers.get(i).getMemberFirstName() + ", Last name: " +
                    listOfMembers.get(i).getMemberLastName() + ", Address: " +
                    listOfMembers.get(i).getMemberStreet() + " " + listOfMembers.get(i).getMemberStreetNumber() + ", Postal code: " +
                    listOfMembers.get(i).getMemberZipCode() + ", City: " +
                    listOfMembers.get(i).getMemberCity() + ", Mobile No: " +
                    listOfMembers.get(i).getMemberMobileNumber());
        }
    }

    public String setNewFirstNameForSavedMember() {
        System.out.println("Enter new first name: ");
        String newFirstName = scanner.nextLine();

        return newFirstName;
    }

    public String setNewLastNameForSavedMember() {
        System.out.println("Enter new last name: ");
        String newLastName = scanner.nextLine();

        return newLastName;
    }

    public String setNewStreetForSavedMember() {
        System.out.println("Enter new street: ");
        String newStreet = scanner.nextLine();

        return newStreet;
    }

    public int setNewStreetNumberForSavedMember() {
        System.out.println("Enter new street no");
        int newStreetNumber = scanner.nextInt();

        return newStreetNumber;
    }

    public int setNewZipCodeForSavedMember() {
        System.out.println("Enter new zip code: ");
        int newZipCode = scanner.nextInt();

        return newZipCode;
    }

    public String setNewCityForSavedMember() {
        System.out.println("Enter new city: ");
        String newCity = scanner.nextLine();

        return newCity;
    }

    public int setNewMobileNumberForSavedMember() {
        System.out.println("Enter new mobile number: ");
        int newMobileNumber = scanner.nextInt();

        return newMobileNumber;
    }
}
