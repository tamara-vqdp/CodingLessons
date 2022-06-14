package Methods;

public class MethodOverloading {

    public static void main(String[] args) {
        //why use overload
        // you want it to cover different scenarios/situations

        int num1 = 5;
        int num2 = 6;
        double num3 = 3.1;
        double num4 = 5.6;
    sumNumbers(num1, num2); // method calling must match the order and the data type
    sumNumbers(num3, num4);
    sumNumbers(num3, num4, num1);

    }

    public static void sumNumbers(int a, int b) { //can use same method name but different parameters
        int sum = a + b;
        System.out.println("Sum of a, b = " + sum);
    }

    public static void sumNumbers(double a, double b) { // different parameters
        double sum = a + b;
        System.out.println("Sum of a, b = " + sum);
    }

    public static void sumNumbers(double a, double b, int c) { //more values with different parameters
        double sum = a + b + c;
        System.out.println("Sum of a, b, c = " + sum);
    }



}
