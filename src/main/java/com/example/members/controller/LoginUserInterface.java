package com.example.members.controller;

import com.example.members.model.LoginMemberDetails;
import org.w3c.dom.ls.LSOutput;

import java.sql.Connection;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

public class LoginUserInterface {

    private String username;
    private String password;

    boolean quit = false;
    Scanner scanner = new Scanner(System.in);
    private final ArrayList<LoginMemberDetails> saveUserLogin = new ArrayList<>();

    Connection dbConnection = null;
    Statement processSqlStatement = null;

    public LoginUserInterface(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public void start() {
        System.out.print("Enter username: ");
        String loginUsername = scanner.nextLine();
        System.out.print("Enter password: ");
        String loginPassword = scanner.nextLine();
        LoginMemberDetails useLoginMemberDetails = new LoginMemberDetails("username", "password");

        //TODO Change if statement to check if user exists and then log in
        /*if (loginUsername.equals(useLoginMemberDetails.getSavedUserName()) &&
        loginPassword.equals(useLoginMemberDetails.getSaveUserPassword())) {
            UserInterface goToUserInterface = new UserInterface();
            goToUserInterface.start();
        }*/

        System.out.println("Remove this text");


        UserInterface goToUserInterface = new UserInterface();
        goToUserInterface.start();
    }
}
