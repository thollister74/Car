package test;

import java.awt.*;
//Created by hollisti on 2019-04-22.

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, world!");
        System.out.println("Total is " + (3 + 4));
        Car myCar = new Car(25.2,
                "CBA-321",
                Color.RED,
                false);
        System.out.println(myCar.licensePlate);

    }
}