package com.example.greenlandbankaccount.Service;

import java.util.Scanner;

public class BankAccountProfile {

    public static void profile() {

        System.out.println("[1] Balance");
        System.out.println("[2] Deposit");
        System.out.println("[3] Withdraw");
        System.out.println("[5] Exit");

        Scanner userInput = new Scanner(System.in);
        String userResponse = String.valueOf(userInput.nextLine());

        if (userResponse.equals("5")) {
            System.out.println("Goodbye");
            System.exit(0);
        }

        if(userResponse.equals("1")){
            //Todo: call class to see deposit
        }else if(userResponse.equals("2")){
            Deposit deposit = new Deposit();
            deposit.depositMoney();
        }else if(userResponse.equals("3")){
            //minus money from bank
        }else{
            BankAccountProfile.profile();
        }
    }
}
