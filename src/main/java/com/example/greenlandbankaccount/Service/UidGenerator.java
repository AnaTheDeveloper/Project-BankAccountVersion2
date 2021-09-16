package com.example.greenlandbankaccount.Service;

import java.util.UUID;

public class UidGenerator {

    public String uuidGenerator(){

        UUID uuid = UUID.randomUUID();
        String uuidAsString = uuid.toString();

        return "Your unique ID is: " + uuidAsString;
    }
}
