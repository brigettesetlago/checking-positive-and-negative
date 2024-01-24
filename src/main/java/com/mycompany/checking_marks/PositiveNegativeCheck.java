package com.mycompany.checking_marks;

import java.util.Scanner;

public class PositiveNegativeCheck {

    public static void main(String[] args) {
        // Get a number from the user
        try (Scanner scanner = new Scanner(System.in)) {
            // Get a number from the user
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            
            // Check whether the number is positive or negative
            if (number > 0) {
                System.out.println("The number is positive.");
            } else if (number < 0) {
                System.out.println("The number is negative.");
            } else {
                System.out.println("The number is zero.");
            }
        }
    }
}
