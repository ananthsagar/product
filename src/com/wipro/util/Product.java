package com.wipro.util;

public class Product {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Please provide two integers as inputs.");
            return;
        }

        try {
            // Parse the command-line arguments
            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[1]);
            int product = num1 * num2;

            // Display the sum
            System.out.println("The product of " + num1 + " and " + num2 + " is: " + product);
        } catch (NumberFormatException e) {
            System.out.println("Error: Please provide valid integers as inputs.");
        }
    }
}
