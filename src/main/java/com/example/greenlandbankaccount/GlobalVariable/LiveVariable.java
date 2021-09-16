package com.example.greenlandbankaccount.GlobalVariable;

import com.example.greenlandbankaccount.Model.RegistrationModel;

public class LiveVariable {

    private static RegistrationModel currentActiveLiveVariable;

    // This is the name we have given to the live variable which is active on the stage

    public static RegistrationModel accessTheCurrentLiveVariable() {
        return currentActiveLiveVariable;
    }

    public static void activateNewLiveVariable(RegistrationModel registrationModel) {
        currentActiveLiveVariable = registrationModel;
    }

    public static void retireLiveVariable() {
        currentActiveLiveVariable = null;
    }
}
