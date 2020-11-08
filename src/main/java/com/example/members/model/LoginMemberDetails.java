package com.example.members.model;

public class LoginMemberDetails {
    private String savedUserName;
    private String saveUserPassword;

    public LoginMemberDetails(String savedUserName, String saveUserPassword) {
        this.savedUserName = savedUserName;
        this.saveUserPassword = saveUserPassword;
    }

    public String getSavedUserName() {
        return savedUserName;
    }

    public String getSaveUserPassword() {
        return saveUserPassword;
    }

    public void setSavedUserName(String savedUserName) {
        this.savedUserName = savedUserName;
    }

    public void setSaveUserPassword(String saveUserPassword) {
        this.saveUserPassword = saveUserPassword;
    }
}
