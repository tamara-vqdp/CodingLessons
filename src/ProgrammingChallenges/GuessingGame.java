package ProgrammingChallenges;

import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        int secretNumber;
        secretNumber = (int) (Math.random() * 99 + 1);

        Scanner scan = new Scanner(System.in);
        int guess;
        System.out.println("Guess a number between 0-100: ");
       do {
           guess = scan.nextInt();


           if (guess == secretNumber) {
               System.out.println("Your guess is correct congratulations");
           } else if (guess < secretNumber) {
               System.out.println("Your guess is lower than the secret number");
           } else if (guess > secretNumber) {
               System.out.println("Your guess is higher than the secret number");
           }

       }while(guess != secretNumber);
        }

    }

