package com.bptn.course.week1;

import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        //write your code below:

        double randomNumber = Math.random() * 100;
        int targetNumber = (int) randomNumber;
        int guess = 80;

        while (guess != targetNumber) {

            double randomGuess = Math.random() * 100;
            guess = (int) randomGuess;

            if (guess >= 1 && guess <= 100) {
                if (guess < targetNumber) {
                    System.out.println("Too low! Try again.");
                } else if (guess > targetNumber) {
                    System.out.println("Too high! Try again.");
                } else {
                    System.out.println("Congratulations! You guessed the number correctly!");
                }
            } else {
                System.out.println("Please enter a number between 1 and 100.");
            }

        }
       
    }
}