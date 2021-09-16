package com.example.greenlandbankaccount.Service;

import com.example.greenlandbankaccount.DataAccessLayer.BankDatabase;
import com.example.greenlandbankaccount.Model.BankAccountModel;
import com.example.greenlandbankaccount.Model.RegistrationModel;

import java.util.Scanner;

public class Deposit {

    public void depositMoney(){

        System.out.println("How much would you like to deposit?");
        Scanner depositInput = new Scanner(System.in);
        String depositResponse = depositInput.nextLine();

        //Todo; save new money to bank account

        System.out.println("What would you like to do now?");
        BankAccountProfile.profile();

    }
}
