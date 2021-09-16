package com.example.greenlandbankaccount;

import com.example.greenlandbankaccount.Controller.BankController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication
public class GreenlandBankAccountApplication {

    public static void main(String[] args) {
        //SpringApplication.run(GreenlandBankAccountApplication.class, args);

        BankController.callWelcome();



    }
}
