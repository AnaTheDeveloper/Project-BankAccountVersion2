package com.example.greenlandbankaccount.DataAccessLayer;

import com.example.greenlandbankaccount.Model.RegistrationModel;

import java.util.ArrayList;
import java.util.Iterator;

import static com.example.greenlandbankaccount.GlobalVariable.LiveVariable.*;

public class BankDatabase {


    private static ArrayList<RegistrationModel> greenlandBankDatabase;

    public static ArrayList<RegistrationModel> databaseAccess(){

        if (greenlandBankDatabase == null){
            greenlandBankDatabase = new ArrayList<>();
        }
        return greenlandBankDatabase;
    }

    public static void addAccount(RegistrationModel newUsersProfile){

        ArrayList<RegistrationModel> usersAccountInformation = databaseAccess();

        usersAccountInformation.add(newUsersProfile);

        for (RegistrationModel registrationModel : greenlandBankDatabase){
            System.out.println(registrationModel.toString());
        }
    }

    public static void removingAccount(String Uid) {

        ArrayList<RegistrationModel> usersAccountInformation = databaseAccess();
        Iterator<RegistrationModel> iterator = usersAccountInformation.iterator();

        while (iterator.hasNext()) {
            RegistrationModel profilesIMightDelete = iterator.next();
            if (profilesIMightDelete.getUid().equals(Uid)) {
                iterator.remove();
            }
        }
    }

    public static void uidRemoveAccount(){

        RegistrationModel profileToDelete = accessTheCurrentLiveVariable();
        String uidOfProfileToDelete = profileToDelete.getUid();
        removingAccount(uidOfProfileToDelete);
        System.out.println("Profile has been deleted:" + profileToDelete.toString());

        retireLiveVariable();
    }

    public static RegistrationModel findUsernamesInTheDatabase(String usernameResponse) {

        RegistrationModel emergencyTemporaryProfileHolder = null;

        for(RegistrationModel databaseProfiles: databaseAccess()) {
            if (databaseProfiles.getUsername().equals(usernameResponse)) {
                emergencyTemporaryProfileHolder = databaseProfiles;
            } else {
                emergencyTemporaryProfileHolder = new RegistrationModel("UNAVAILABLE", "");
            }
        }
        return emergencyTemporaryProfileHolder;
    }

    public static void updateUsername(String Uid, String newUsername){

        ArrayList<RegistrationModel> usersAccountInformation = databaseAccess();
        RegistrationModel currentProfile = accessTheCurrentLiveVariable();
        currentProfile.setUsername(newUsername);
        removingAccount(Uid);
        addAccount(currentProfile);
        activateNewLiveVariable(currentProfile);
    }

   //Todo: Able to update the password but has to be authenticated first

    public static void deposit(RegistrationModel depositAmount){

        ArrayList<RegistrationModel> bankAccountProfile = databaseAccess();

        bankAccountProfile.add(depositAmount);

        for (RegistrationModel registrationModel : greenlandBankDatabase){
            System.out.println(registrationModel.toString());
        }
    }



}
