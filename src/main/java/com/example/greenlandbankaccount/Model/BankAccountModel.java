package com.example.greenlandbankaccount.Model;

public class BankAccountModel {

    private long balance;
    private long deposit;
    private long withdraw;

    public BankAccountModel(long balance, long deposit, long withdraw) {
        this.balance = balance;
        this.deposit = deposit;
        this.withdraw = withdraw;
    }

    public BankAccountModel(String balance) {
        this.balance = balance;
    }

    public BankAccountModel(long balance, long deposit) {
        this.balance = balance;
        this.deposit = deposit;
    }


}
