package com.example.greenlandbankaccount.Service;

import com.example.greenlandbankaccount.DataAccessLayer.BankDatabase;
import com.example.greenlandbankaccount.GlobalVariable.LiveVariable;
import com.example.greenlandbankaccount.Model.RegistrationModel;

import java.util.Scanner;

public class SignInService {

    public void signIn(){

        System.out.println("Enter your Username:");

        Scanner usersUsername = new Scanner(System.in);
        String usernameResponse = usersUsername.nextLine();

        RegistrationModel registrationModel =  BankDatabase.findUsernamesInTheDatabase(usernameResponse);

        if (registrationModel.getUsername().equals("UNAVAILABLE")) {
            System.out.println("This username does not exist.");
            WelcomeService.welcome();
        }

        System.out.println("This username is correct. Please enter your password.");

        Scanner usersPassword = new Scanner(System.in);
        String passwordResponse = usersPassword.nextLine();

        if (registrationModel.getPassword().equals(passwordResponse)) {
            LiveVariable.activateNewLiveVariable(registrationModel);
            BankAccountProfile.profile();
        } else {
            System.out.println("Password does not match, please try again");
            WelcomeService.welcome();
        }

    }
}
