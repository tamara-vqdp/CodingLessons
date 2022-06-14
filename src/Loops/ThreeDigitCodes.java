package Loops;

public class ThreeDigitCodes {

    public static void main(String[] args) {
    int amount = 0;
    // checks if i is less than or equal to 4
        // will increment until it gets to 4
        for(int i = 1; i <= 4; i++) {

            // checks if j is less than or equal to 4
            // will increment until it gets to 4
            for(int j = 1; j <= 4; j++) {

                // checks if k is less than or equal to 4
                // will increment until it gets to 4
                for(int k = 1; k <= 4; k++) {

                    //checks all numbers are not equal to each other
                    if(k != i && k != j && i != j) {
                        //increments through the amount until
                        // there is no more possible variations of i j k
                        amount++;
                        System.out.println(i + "" + j + "" + k);

                    }
                }
            }
        }
        System.out.println("The total amount of 3 digit variations is: " +  amount);
    }
}
