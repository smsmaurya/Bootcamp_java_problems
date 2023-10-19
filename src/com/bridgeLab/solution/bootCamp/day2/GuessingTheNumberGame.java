package com.bridgeLab.solution.bootCamp.day2;

import java.util.Scanner;

public class GuessingTheNumberGame {
	
public static void main(String[] args) {
		
		int generateRandomNum = (int) (Math.floor(Math.random()*100));

		System.out.println(" System generate a random number between 1 to 100");
		System.out.println("Now your turn, try to guess the number --- ");
		Scanner scan = new Scanner(System.in);
		//boolean guessed = false; 

//		while(!guessed) {
//			System.out.print("Enter your guess number : ");
//			int userGuessNumber = scan.nextInt();
//			
//			if(userGuessNumber == generateRandomNum) {
//				guessed = true;
//				System.out.println("You have guess same number.");
//			}
//			else if(userGuessNumber < generateRandomNum) {
//				System.out.println("Two low");
//			}
//			else {
//				System.out.println("too high");
//			}
//		}
		
		for(int i=1;i<=12;i++) {
			int guessingNumber = scan.nextInt();
			if(guessingNumber ==generateRandomNum) {
				System.out.println("YOU WIN ");
				break;
			}
			else if(i<12){
				System.out.print("try again..");
			}
			else {
				System.out.println("COMPUTER WIN");
			}
		}
		
	}


}
