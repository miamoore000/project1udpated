package com.miamooreproject1;

import java.util.Scanner;

public class query {

    static void memberQuery()  {

        System.out.println("Hello and Welcome to the Airline Member Portal!... ");
        System.out.println("Please Choose From the Following Menu to View Your Personal Member Statement");
        System.out.println("or Feel Free to Select From Any of The Following Other Choices!...");
        System.out.println("Please Make a Selection from the Following Menu to Continue. ");
        System.out.println(" "); //space
        System.out.println("********************** Member & Rewards Menu ***********************");
        System.out.println("(1.) - Enter 1 to Review Rewards Program Based Off Tiers!...");
        System.out.println("(2.) - Enter 2 to Review Your Member Information via Member ID!...");
        System.out.println("(3.) - Enter 3 to Exit the Airline Member Portal!...");
        System.out.println(" ");
        System.out.print("Enter Menu Number Here: ");
        int choice;
        Scanner userChoice = new Scanner(System.in);
        choice = userChoice.nextInt();

        switch (choice) {

            //case
            case 1:
                System.out.println("Gold – 25,000 miles. Gold passengers get special perks such as a seat to sit in during the flight.");
                System.out.println(" ");
                System.out.println("Platinum – 50,000 miles. Platinum passengers get complementary upgrades to padded seats.");
                System.out.println(" ");
                System.out.println("Platinum Pro – 75,000 miles. Platinum Pro is a special sub-tier of Platinum, in which the\n" +
                        "padded seats include arm rests ");
                System.out.println(" ");
                System.out.println("Executive Platinum – 100,000 miles. Executive Platinum passengers enjoy perks such as\n" +
                        "complementary upgrades from the cargo hold to main cabin.");
                System.out.println(" ");
                System.out.println("Super Executive Platinum – 150,000 miles. Super Executive Platinum is a special sub-tier\n" +
                        "of Executive Platinum, reserved for the most loyal passengers.");
                System.out.println(" ");
            case 2:
                //program will continue and run through main so member can enter ID and get their information

            case 3:
                if (choice == 3){
                    System.exit(0);

                }
        }


    }
}
