package ArraysAndLists;

import java.util.Scanner;

public class ExistInArray {

    public static void main(String[] args) {
        int[] arr = {2, 24, 56, 22, 98, 6};
        boolean found = false;

        Scanner scan = new Scanner(System.in);
        System.out.println("Try to guess the integer in the array!(0-100): ");
        int value = scan.nextInt();

        for(int i = 0; i < arr.length; i++) {
            if (value == arr[i]) {
                found = true;
                break;
            }
        }
    if(found) {
        System.out.println("Your are correct! :) " + value + " is in this array.");
    }
        else {
            System.out.println("Your are incorrect! :( " + value + " is not in this array.");
        }
    }

        }



