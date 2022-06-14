package ProgrammingChallenges;

import java.util.Scanner;

public class AreaOfRectangleChall3 {

    public static void main(String[] args) {

        int width, height, length;
        Scanner scan = new Scanner(System.in);

        System.out.print("please enter the height of the rectangle ");
        height = scan.nextInt();

        System.out.print("Please enter the width of the rectangle ");
        width = scan.nextInt();

        System.out.print("Please enter the length of the rectangle ");
        length = scan.nextInt();

        int area = getArea(height, width);
        int volume = getVolume(height, width, length);
        System.out.println("The area of your rectangle is " + area);
        System.out.println("The volume of your rectangle is " + volume);

    }

    public static int getArea(int width, int height) {

        int area = width * height;
        return area;
    }

    public static int getVolume(int width, int height, int length) {
        int volume = width * height * length;
        return volume;
    }

}
