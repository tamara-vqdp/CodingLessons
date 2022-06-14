package ArraysAndLists;

import java.util.LinkedList;

//arraylist uses more memory than an array does. memory is fixed with an array

public class UsingArrayLists {

    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();
        names.add("Tamara");
        names.add("John");
        names.add("George");
        System.out.println(names);

       // for(String name : names ) {
        //    System.out.print(name + " ");

        //}

        names.remove("John");//removes elements from arraylist
        System.out.println(names);
        System.out.println(names.size()); //finds size of arraylist
        System.out.println(names.contains("Tamara")); // prints true if array contains element
    }
}
