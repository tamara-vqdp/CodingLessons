package Loops;

import java.util.Scanner;
public class TimesTable {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("What times table would you like?: ");

        int num = reader.nextInt();
        System.out.println("Here is the " + num + " times table!");

        for(int i = 0; i <= 12; i++) {
            System.out.println(num + "x" + i + "=" + num*i);
        }


    }


}
