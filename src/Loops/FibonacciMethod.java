package Loops;

import java.util.Scanner;

public class FibonacciMethod {
    static int n1=0,n2=1,n3=0;

    public static void main(String[] args) {

        //Take input from the user
        //Create instance of the Scanner class
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n=sc.nextInt();   //Declare and Initialize the number of terms
        System.out.print("Fibonacci Series up to "+n+" terms: ");
        System.out.print(n1+" "+n2);//printing 0 and 1
        printFibonacci(n-2);
    }
    public static void printFibonacci(int n)
    {
        //Prints Fibonacci Series using Recursion
        //The Fibonacci series is a series where the next term
        // is the sum of the previous two terms.
        if(n>0)
        {
            n3 = n1 + n2; // first two numbers of fib = 0, 1
            System.out.print(" "+n3);
            //assign value of n2 to n1 and n3 to n2
            n1 = n2;
            n2 = n3;
            printFibonacci(n-2);
        }
    }
}



