package com.example.greenlandbankaccount.Service;

import java.util.Scanner;

public class WelcomeService {

    public static void welcome(){

        System.out.println("Welcome to the bank!");
        System.out.println("====================");
        System.out.println("[1] Sign Up");
        System.out.println("[2] Sign In");
        System.out.println("[3] Exit Bank");

        Scanner userInput = new Scanner(System.in);
        String userResponse = String.valueOf(userInput.nextLine());

        if(userResponse.equals("3")){
            System.out.println("Goodbye");
            System.exit(0);
        }

        if(userResponse.equals("1")){
            SignUpService signUpService = new SignUpService();
            signUpService.signUp();
        }else if(userResponse.equals("2")){
            SignInService signInService = new SignInService();
            signInService.signIn();
        }else{
            WelcomeService.welcome();
        }
    }
}
