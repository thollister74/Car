package test;

import java.awt.*;
import java.util.Scanner;
import java.util.Arrays;
//Created by hollisti on 2019-04-22.

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello, world!");
//        System.out.println("Total is " + (3 + 4));
//        Car myCar = new Car(25.2,
//                "CBA-321",
//                Color.RED,
//                false);
//        System.out.println(myCar.licensePlate);
//
//        Scanner scan = new Scanner(System.in);  // Create a Scanner object
//        System.out.println("Enter username");
//
//        String userName = scan.nextLine();  // Read user input
//        System.out.println("Username is: " + userName);  // Output user input
//        System.out.println(userName.toUpperCase());
//        System.out.println(userName.toLowerCase());
//        System.out.println("\n");
        int[] randomNumbers = {98, 0, 41, 82, 323, 38};

        //for loop
        for (int forLoopInt : randomNumbers) System.out.println("Array element: " + forLoopInt);
        System.out.println("\n");

        //Do While Loop
        int doWhileLoopInt = 1;
        do {
            System.out.println("This is 'do while' loop " + doWhileLoopInt + " of 5");
            doWhileLoopInt++;
        } while (doWhileLoopInt < 6);
        System.out.println("\n");

        //while loop
        int whileLoopInt = 1;
        while (whileLoopInt < 6) {
            System.out.println("While loop " + whileLoopInt);
            whileLoopInt++;
        }
        //print general info on the int array 'randomNumbers'
        System.out.println("\nThere are " + randomNumbers.length + " elements in the array 'randomNumbers'");

        // Why did I have to convert the int array to a string to print out the sorted list
        // when the unsorted list could print without an issue?
        Arrays.sort(randomNumbers);
        System.out.println("Here's a sorted array" + Arrays.toString(randomNumbers));


    }
}

