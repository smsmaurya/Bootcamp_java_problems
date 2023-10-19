package com.bridgeLab.solution.bootCamp.day1;
import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Temperature Conversion Program");
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        System.out.print("Enter your choice (1 or 2): ");
        int choice = scanner.nextInt();

        double temperature;

        if (choice == 1) {
            System.out.print("Enter temperature in Fahrenheit: ");
            temperature = scanner.nextDouble();
            double celsius = (temperature - 32) * 5 / 9;
            System.out.println("Temperature in Celsius: " + celsius + " °C");
        } else if (choice == 2) {
            System.out.print("Enter temperature in Celsius: ");
            temperature = scanner.nextDouble();
            double fahrenheit = (temperature * 9 / 5) + 32;
            System.out.println("Temperature in Fahrenheit: " + fahrenheit + " °F");
        } else {
            System.out.println("Invalid choice. Please enter 1 or 2.");
        }

        scanner.close();
    }
}

