package ArraysAndLists;

public class FirstArray {

    public static void main(String[] args) {
       /* double[] myList = {1.9, 2.9, 3.4, 3.5};

        for(int i = 0; i < myList.length; i++) { // .length returns an integer the length of your array
            System.out.print(myList[i] + " ");  //1D array has single row
        }
        */
        int [][] a = {{1, -2, 3}, {-4, -5, 6, 9}, {7}};

        for(int i = 0; i < a.length; i++) { // for loop prints out the objects which is 3 (rows)
            for(int j = 0; j < a[i].length; j++) { // 2nd loop looks at the contents of each item (columns)
                System.out.print(a[i][j] + " "); // a[0][0], a[0][1], a[0][2] etc
            }
        }
    }
}
