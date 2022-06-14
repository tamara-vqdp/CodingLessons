package ProgrammingChallenges;

import java.util.Scanner;

public class DisplayNameChall2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hello, please enter your name: ");
        String name = scan.nextLine();

        System.out.println("Hello " + name);
    }
}
