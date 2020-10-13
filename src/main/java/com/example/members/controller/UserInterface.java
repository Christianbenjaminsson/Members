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

            switch (userInput) {
                case 1:
                    addNewMember(manageMembers);
                    break;
                case 2:
                    changeMemberDetails();
                    break;
                case 3:
                    removeMemberFromDatabase();
                    break;
                case 4:
                    viewSavedMemberDetails();
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

    public void addNewMember(ManageMembers manageMembers) {
        System.out.println("Fill in all fields to add a new member.\n");
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

    }

    public void removeMemberFromDatabase() {
        //Insert code here
    }

    public void viewSavedMemberDetails() {
        System.out.println("\nMember List");
        for (int i=0; i<listOfMembers.size(); i++) {
            System.out.println("First name: " +
                    listOfMembers.get(i).getMemberFirstName() + ", Last name: " +
                    listOfMembers.get(i).getMemberLastName() + ", Address: " +
                    listOfMembers.get(i).getMemberStreet() + " " + listOfMembers.get(i).getMemberStreetNumber() + ", Postal code: " +
                    listOfMembers.get(i).getMemberPostalCode() + ", City: " +
                    listOfMembers.get(i).getMemberCity() + ", Mobile No: " +
                    listOfMembers.get(i).getMemberMobileNumber());
        }
    }
}
