package com.example.members;

import com.example.members.controller.LoginUserInterface;
import com.example.members.controller.UserInterface;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*Scanner scanner = new Scanner(System.in);
        boolean isLoggedIn = false;

        System.out.println("Sign in to your account \n");

        while (!isLoggedIn) {
            System.out.println("Enter username");
            String username = scanner.nextLine();
            System.out.println("Enter password");
            String password = scanner.nextLine();
        }*/

        LoginUserInterface loginUserInterface = new LoginUserInterface("username", "password");
        loginUserInterface.start();
    }
}
