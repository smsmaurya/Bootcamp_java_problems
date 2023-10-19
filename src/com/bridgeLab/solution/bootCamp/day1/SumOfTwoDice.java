package com.bridgeLab.solution.bootCamp.day1;

import java.util.Scanner;
import java.math.*;

public class SumOfTwoDice {
	public static void main(String[] args) {
		Scanner scan =  new Scanner(System.in);
		
		System.out.println("Roll the both dices dice1 and dice2 ");
		double dice1 = (Math.floor(Math.random()*10)%6)+1;
		if(dice1 >0)
			System.out.println("Dice1 :"+dice1);
		
		double dice2 = (Math.floor(Math.random()*10)%6)+1;
		if(dice2 >0)
			System.out.println("Dice2 :"+dice2);
		
		int sumOfDice = (int)(dice1+dice2);
		
		System.out.println("Sum to both dice is "+sumOfDice);
	}

}
