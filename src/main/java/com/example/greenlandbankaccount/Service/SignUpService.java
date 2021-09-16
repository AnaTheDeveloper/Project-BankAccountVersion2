package com.example.greenlandbankaccount.Service;

import com.example.greenlandbankaccount.DataAccessLayer.BankDatabase;
import com.example.greenlandbankaccount.Model.RegistrationModel;

import java.util.Scanner;

public class SignUpService {

    public void signUp(){

        System.out.println("Please enter a username: ");
        Scanner usernameInput = new Scanner(System.in);
        String usernameResponse = usernameInput.nextLine();

        System.out.println("Please Enter a Password");
        Scanner passwordInput = new Scanner(System.in);
        String passwordResponse = passwordInput.nextLine();

        RegistrationModel newAccount = new RegistrationModel(usernameResponse, passwordResponse);

        BankDatabase.addAccount(newAccount);

        System.out.println("Thanks for signing up! Now Sign In!");
        WelcomeService.welcome();

    }
}
