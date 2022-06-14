package Methods;

public class Methods {

    public static void main(String[] args) {
/*
        double length = 2;
        double total = cubeLength(length); // populates total with cubeLength method, passing length into double l
        System.out.println(total + " is the cube of " + length + "!"); // l only exists in method
    }

    public static double cubeLength(double l) { //method for cube
        return l*l*l;
    }
*/
        int a = 4;
        int b = 6;

        //Method calls
        int c = sumMethod(a, b); // will call method and assign value of a,b to value n,m
        // sumMethod will execute so a + b = sum
        //value c will now = sum
        //c is passed into display method which prints out the sum
        display(c); // transfer sumMethod declared as c into the display method
    }
    public static int sumMethod(int n, int m) {
        int sum = 0;
        sum = n + m;
        return sum;
    }
    public static void display(int sum) {
        System.out.println("This method prints the variable");
        System.out.println("The sum is = " + sum);
    }


}
