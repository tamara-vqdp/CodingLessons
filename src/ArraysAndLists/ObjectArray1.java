package ArraysAndLists;

class ObjectArray1 {

    public static void main(String[] args) {

        Account obj[] = new Account[2];
        for (int i = 0; i < 2; i++) {
            int x = 1;
            int y = 2;
            obj[i] = new Account();
            obj[i].setData(x + 1, y + i);
            System.out.println("For Array Element 0");
            obj[i].showData();


        }
        // obj[0].setData(1,2);
        //obj[1].setData(3, 4);
        //System.out.println("For Array Element 0");
        //obj[0].showData();
        //System.out.println("For Array Element 1");
        //obj[1].showData();

    }
}

    class Account {
        int a;
        int b;

        public void setData(int c, int d) {
            a = c;
            b = d;
        }

        public void showData() {
            System.out.println("Value of a = " + a);
            System.out.println("Value of b = " + b);
        }
    }


