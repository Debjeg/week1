package com.bptn.course.week1;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
	
		System.out.println("Calculator Menu:");
        System.out.println("Press 1 for addition");
        System.out.println("Press 2 for subtraction");
        System.out.println("Press 3 for multiplication");
        System.out.println("Press 4 for division");
        System.out.println("Press 5 to square a number");
        System.out.println("Press 6 to find a square root");
        System.out.println("Press 7 to find the reciprocal");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt() ;
        double number1, number2, result ;
        if ( choice == 1){
            System.out.print("Enter the first number: ");
            number1 = sc.nextDouble();
            System.out.print("Enter the second number: ");
            number2 = sc.nextDouble();
            result = number1 + number2;
            System.out.println("The sum of the numbers " + number1 + " and " +  number2  + " is = " + result + " To continue calculation Press 1, else press any other number to exit");
        } else if (choice ==2 ) {
            System.out.print("Enter the first number: ");
            number1 = sc.nextDouble();
            System.out.print("Enter the second number: ");
            number2 = sc.nextDouble();
            result = number1 - number2;
            System.out.println("The difference of the numbers " + number1 + " and " + number2 + " is = " + result);
        } else if (choice == 3) {
            System.out.print("Enter the first number: ");
            number1 = sc.nextDouble();
            System.out.print("Enter the second number: ");
            number2 = sc.nextDouble();
            result = number1 * number2;
            System.out.println("The product of the numbers " + number1 + " and " + number2 + " is = " + result);
        } else if (choice == 4) {
            System.out.print("Enter the first number: ");
            number1 = sc.nextDouble();
            System.out.print("Enter the second number: ");
            number2 = sc.nextDouble();
            result = number1 / number2;
            System.out.println("Dividing " + number1 + " by " + number2 + " the quotient is " + result);
            System.out.println("The remainder is " + number1 % number2);
        } else if (choice == 5) {
            System.out.print("Enter the number to find square: ");
            number1 = sc.nextDouble();
            result = number1 * number1;
            System.out.println("The Square of the number" +  number1 + " is = " + result);
        } else if (choice == 6){
            System.out.print("Enter the number to find square root: ");
            number1 = sc.nextDouble();
            result = Math.sqrt(number1);
            System.out.println("The Square of the number" +  number1 + " is = " + result);
        } else if(choice == 7){
            System.out.print("Enter the number to find Reciprocal: ");
            number1 = sc.nextDouble();
            result = 1/ number1;
            System.out.println("The Reciprocal of the number" +  number1 + " is = " + result);
        }
        else {
            System.out.println("Invalid choice");
        }
      
    }
}
        
