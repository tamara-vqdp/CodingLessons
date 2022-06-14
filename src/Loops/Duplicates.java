package Loops;

import java.util.Arrays;
import java.util.Random;

public class Duplicates {

    public static void main(String[] args) {

        int[] arr1 = new int[10];
        int[] arr2 = new int[10];

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = new Random().nextInt(20) + 1;
            for (int j = 0; j < arr2.length; j++) {
                arr2[j] = new Random().nextInt(20) + 1;

                if (arr1[i] == arr2[j]) {
                    System.out.println("Index " + i + " same as Index " + j + " with value "
                            + arr1[i] + " " + arr2[i]);
                }


            }
        }

    }

}
