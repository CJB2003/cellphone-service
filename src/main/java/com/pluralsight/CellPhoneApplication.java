package com.pluralsight;
import java.util.*;

public class CellPhoneApplication {

    static Scanner myScanner = new Scanner(System.in);

    public static void main(String[] args) {

        //Created instances (objects)
        CellPhone myPhone = new CellPhone();
        CellPhone cellPhone2 = new CellPhone();

        //testing display method to see if it works
        //Update: it works
        display(myPhone);
        display(cellPhone2);

        //the two different phones dial each other
        myPhone.dial(cellPhone2.getPhoneNumber());
        cellPhone2.dial(myPhone.getPhoneNumber());
    }

    public static void display(CellPhone phone) {

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
        System.out.print("\n");

        //set data with user input
        phone.setSerialNumber(userSerial);
        phone.setModel(userModel);
        phone.setCarrier(userCarrier);
        phone.setPhoneNumber(userNumber);
        phone.setOwner(userName);

        //store getters in variables
        int currentSN = phone.getSerialNumber();
        String currentM = phone.getModel();
        String currentC = phone.getCarrier();
        String currentNum = phone.getPhoneNumber();
        String ownerName = phone.getOwner();

        //print out string variables with getters stored
        System.out.println(currentSN);
        System.out.println(currentM);
        System.out.println(currentC);
        System.out.println(currentNum);
        System.out.println(ownerName + "\n");
    }
}
