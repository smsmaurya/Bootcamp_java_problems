package com.bridgeLab.solution.basicPractice;

import java.util.Scanner;

public class CheckTheSeason {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int monthNumber;
        String season = "";
        
        while (true) {
            try {
                System.out.print("Enter a month number (1-12): ");
                monthNumber = Integer.parseInt(scanner.nextLine());
                
                if (monthNumber < 1 || monthNumber > 12) {
                    throw new IllegalArgumentException("Month number must be between 1 and 12.");
                }
                
                // Determine the season based on the entered month
                switch (monthNumber) {
                    case 2:
                    case 3:
                        season = "Vasanta";
                        break;
                    case 4:
                    case 5:
                        season = "Grishma / Summer";
                        break;
                    case 6:
                    case 7:
                        season = "Monsoon / Rainy";
                        break;
                    case 8:
                    case 9:
                        season = "Sharada";
                        break;
                    case 10:
                    case 11:
                        season = "Hemanta";
                        break;
                    case 12:
                    case 1:
                        season = "Shishira / Winter";
                        break;
                }
                
                System.out.println("The season for month " + monthNumber + " is: " + season);
                break; // Exit the loop if a valid month is entered
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        
        scanner.close();
    }

}
