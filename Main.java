package com.miamooreproject1;
import java.io.*;
import java.util.Scanner;
/** *
Program Description: For this project I included my entire program in
2 classes. I utilized 2 import statements. java.util.Scanner is used to take input via keyboard,
and java.io.* is used for reading/outputting files. In my Main.java class there are 2 methods.
One is my main method, the other reads and searches through the txt file. In
 my second class named query.java, there is one method that executes the
 queries for the member! When you run the program, you should
be directed towards a welcoming prompt followed by a menu with 3 choices that vary
depending on what the member is looking for. Thank you!

Mia Moore
CS2336.002
Dr. Brian Ricks
Project 1 Task 1
*/

public class Main {

    private static Scanner x;

    public static void main(String[] args){
        boolean run = true; //to loop program multiple times

        while (run) {
            query.memberQuery();//will output queries/choices to member


            int memberID; //will hold entered ID via keyboard input

            //scanner object to read keyboard input
            Scanner userID = new Scanner(System.in);

            System.out.print("Hello there! If You'd Like to Check Your Member Information, Then Please Enter Your Member ID: ");
            memberID = userID.nextInt();
            String filepath = "input.txt";
            String searchTerm = String.valueOf(memberID);

            readFile(searchTerm, filepath);

        }
    }

    public static void readFile(String searchTerm, String filepath) {

        boolean found = false; //to determine if ID was found in txt file
        String ID = " "; String date = " "; String miles = " ";
        try {
                x = new Scanner(new File(filepath));
                x.useDelimiter(" ");
                while (x.hasNext() && !found ) {

                    date = x.next();
                    ID = x.next();
                    miles = x.next();

                    if (ID.equals(searchTerm)) {
                        found = true;
                    }

                }

                if (found) {
                    System.out.println( "Date: " + date + " ID: " + ID + " Miles: " + miles );

                }
                else {
                    System.out.println( "Member Record not Found!");
                }

            }
        //if reading through the file ultimately fails, exception is made
        catch(Exception e) {
            System.out.println( "Oh no! There has unfortunately been an error...Please run again!");
        }
    }




}


