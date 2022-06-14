package Loops;

import java.util.Scanner;

public class SumNumbers {

    public static void main(String[] args) {

        int sumTotal = 0, i = 1;
        Scanner reader = new Scanner(System.in); // reads input from user
        System.out.println("Input a number to sum to: ");
        int num = reader.nextInt();

        while (i <= num) {
            // Update the current sum till
            // test condition holds true
            sumTotal += i;
            //increment i until it equals num
            i++;
        }

        System.out.println("The sum of " + num + " = " + '\n' + sumTotal);
    }
}
