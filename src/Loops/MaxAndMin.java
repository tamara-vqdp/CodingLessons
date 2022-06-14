package Loops;

import java.util.Arrays;
import java.util.Random;
public class MaxAndMin {


    public static void main(String[] args) {

        int[] arr = new int[10]; //declare an array
        // inserts random numbers into array of length 10, range between 0-10
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Random().nextInt(10) + 1;
            System.out.print(arr[i] + " ");
        }

        int min = arr[0];
        int max = arr[0];
        // for loop changes the value of min
        // each time a lower number comes up
        // e.g. arr = 5,4,1,2 arr[0] = 5
        // checks if 5 < min. min is currently 5, 5 < 5 moves on
        // 4 = arr[1], min is 5. now checks if 4 < 5. true so 4 is the new min
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] <= min) {
                min = arr[i];
            }
            if (arr[i] >= max) {
                max = arr[i];
            }
        }

        System.out.println('\n' + "Minimum = " + min);
        System.out.println("Maximum = " + max);


    }
}