package ArraysAndLists;

import java.util.Arrays;

public class TestArray {

    public static void main(String[] args) {
        int sum = 0;
        double avg = 0;
        int[] arr = {2, 6, 3, 6, 10, 5, 2, 10, 2, 10};

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            avg = sum / arr.length;

        }
        System.out.println("The sum of array: "
                + Arrays.toString(arr) + " = " + sum);
        System.out.println("The average of array: "
                + Arrays.toString(arr) + " = " + avg);
    }

}
