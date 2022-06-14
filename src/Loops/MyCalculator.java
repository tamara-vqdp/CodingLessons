package Loops;

import java.util.Scanner;

public class MyCalculator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Tamara's Calculator!");

        System.out.print("Please enter number 1: ");
        int num1 = scan.nextInt();

        System.out.print("Please enter number 2: ");
        int num2 = scan.nextInt();

        System.out.println("Two numbers summed = " + sum(num1, num2));
        System.out.println("Two numbers subtracted = " + subtract(num1, num2));
        System.out.println("Two numbers multiplied = " + multiply(num1, num2));
        System.out.println("Two numbers divided = " + divide(num1, num2));

        System.out.println("That was Tamara's Calculator, thanks for playing!");

    }

    public static int sum(int a, int b) {
        int sum = 0;
        sum = a + b;
        return sum;
    }

    public static int subtract(int a, int b) {
        int subtract = 0;
        subtract = a - b;
        return subtract;
    }

    public static int multiply(int a, int b) {
        int multiply = 0;
        multiply = a * b;
        return multiply;
    }

    public static int divide(int a, int b) {
        int divide = 0;
        divide = a / b;
        return divide;
    }


}
