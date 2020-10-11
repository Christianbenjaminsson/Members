package com.example.members.model;

import java.util.ArrayList;

public class NewUserAccount {
    private String username;
    private String password;

    private final ArrayList<String> listUserAccounts = new ArrayList();

    public NewUserAccount(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public static NewUserAccount createLoginAccount(String username, String password) {
        return new NewUserAccount(username, password);
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public ArrayList<String> getListUserAccounts() {
        return listUserAccounts;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}


