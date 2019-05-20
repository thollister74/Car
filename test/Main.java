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
        int[] randomNumbers = {98, 0, 41, 3, 5, 82, 978, 323, 38, 915};

        //for loop
        for (int i : randomNumbers) System.out.println("Array element " + i);
        System.out.println("\n");

        //Do While Loop
        int x = 1;
        do {
            System.out.println("This is 'do while' loop " + x + " of 5");
            x++;
        } while (x < 6);
        System.out.println("\n");

        //while loop
        int doWhileInt = 1;
        while (doWhileInt < 6) {
            System.out.println("While loop " + doWhileInt);
            doWhileInt++;
        }
        //print general info on the int array 'randomNumbers'
        System.out.println("\nThere are " + randomNumbers.length + " elements in the array 'randomNumbers'");
        System.out.println(Arrays.sort(randomNumbers));
    }
}

