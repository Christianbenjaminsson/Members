package com.example.members.controller;

import com.example.members.model.ManageMembers;

import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
    Scanner scanner = new Scanner(System.in);
    boolean quit = false;

    ManageMembers manageMembers = new ManageMembers();
    private final ArrayList<ManageMembers> listOfMembers = new ArrayList<>();

    private void start() {
        while (!quit) {
            printMenu();
            System.out.println("\nChoose alternative:");
            String userInput = scanner.nextLine();

            switch (userInput) {
                case 1:
                    addNewMember();
                    break;
                case 2:
                    ChangeMemberDetails();
                    break;
                case 3:
                    removeMemberFromDatabase();
                    break;
                case 4:
                    viemSavedMemberDetails();
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

    }
}
