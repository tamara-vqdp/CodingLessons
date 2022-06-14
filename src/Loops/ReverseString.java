package Loops;

import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        String r = "";

        //Input String
        System.out.print("Input a string: ");
        String letters = reader.nextLine();

        //Loop in reverse order
        for (int i = letters.length() - 1; i >= 0; i--) {
        r += letters.charAt(i);

        }
        System.out.println("Reversed String = " + r);
    }
}
