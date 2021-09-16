package com.example.greenlandbankaccount.Model;

import com.example.greenlandbankaccount.Service.UidGenerator;

public class RegistrationModel {

    private String username;
    private String password;
    private String Uid;

    UidGenerator uidGenerator = new UidGenerator();

    public RegistrationModel(String username, String password) {
        this.username = username;
        this.password = password;
        this.Uid = uidGenerator.uuidGenerator();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUid() {
        return Uid;
    }

    @Override
    public String toString() {
        return "RegistrationModel{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", Uid='" + Uid + '\'' +
                '}';
    }
}
