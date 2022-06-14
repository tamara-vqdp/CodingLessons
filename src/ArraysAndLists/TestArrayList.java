package ArraysAndLists;

import java.util.ArrayList;

public class TestArrayList {
    public static void main(String[] args) {
        ArrayList<String> arlTest = new ArrayList<>();
        System.out.println("Size of array list at creation: " + arlTest.size());
        arlTest.add("D");
        arlTest.add("U");
        arlTest.add("K");
        arlTest.add("E");

        System.out.println("Array size now: " + arlTest.size());

        arlTest.remove("D");
        System.out.println("Array size after removing 1 element: " + arlTest.size());

        arlTest.remove(2);
        System.out.println("contents after removing element by index: " + arlTest.size());
    }
}
