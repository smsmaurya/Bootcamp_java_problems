package com.bridgeLab.solution.bootCamp.day1;

import java.util.Scanner;

public class RandomOperatorMath {
	public static void main(String[] args) {
		Scanner Scan =  new Scanner(System.in);
		
		double firstNumber = (Math.floor(Math.random()*10));
		System.out.print("First random number is : ");
		System.out.println(firstNumber);
		
		double secondNumber = (Math.floor(Math.random()*10));
		System.out.print("Second random number is : ");
		System.out.println(secondNumber);
		
        char operator = operators();
       double result =0;
       
        switch(operator) {
        	case '+':
        		result = firstNumber + secondNumber;
        		break;
        	case '-':
        		result = firstNumber - secondNumber;
        		break;
        	case '*':
        		result = firstNumber * secondNumber;
        		break;
        	case '/':
        		result = firstNumber / secondNumber;
        		break;
        	case '%':
        		result = firstNumber % secondNumber;
        		break;
        	default:
        		System.out.println("Invalid operator");
        }
        
        System.out.println("The result is "+result);

	}

	private static char operators() {
		int index = (int)((Math.floor(Math.random()*10))%5); 
		char[] operators = {'+', '-', '*', '/'};
        return operators[index];
	}

	

}
