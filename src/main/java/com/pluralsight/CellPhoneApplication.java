package com.pluralsight;
import java.util.*;

public class CellPhoneApplication {
    public static Scanner myScanner = new Scanner(System.in);
    public static void main(String[] args) {

        CellPhone serialNumber = new CellPhone();
        CellPhone phoneModel = new CellPhone();
        CellPhone phoneCarrier = new CellPhone();
        CellPhone phoneNumber = new CellPhone();
        CellPhone owner = new CellPhone();

        //ask for user input with questions
        System.out.print("What is the serial number? ");
        int userSerial = myScanner.nextInt();
        myScanner.nextLine();
        System.out.print("What model is the phone? ");
        String userModel = myScanner.nextLine();
        System.out.print("Who is the carrier? ");
        String userCarrier = myScanner.nextLine();
        System.out.print("What is the phone number? ");
        String userNumber = myScanner.nextLine();
        System.out.print("Who is the owner of the phone? ");
        String userName = myScanner.nextLine();


        //set data with user input
        serialNumber.setSerialNumber(userSerial);
        phoneModel.setModel(userModel);
        phoneCarrier.setCarrier(userCarrier);
        phoneNumber.setPhoneNumber(userNumber);
        owner.setOwner(userName);

        //store getters in variables
        int currentSN = serialNumber.getSerialNumber();
        String currentPM = phoneModel.getModel();
        String currentPC = phoneCarrier.getCarrier();
        String currentNum = phoneNumber.getPhoneNumber();
        String ownerName = owner.getOwner();

        //print out string variables with getters stored
        System.out.println(currentSN);
        System.out.println(currentPM);
        System.out.println(currentPC);
        System.out.println(currentNum);
        System.out.println(ownerName);





    }
}
