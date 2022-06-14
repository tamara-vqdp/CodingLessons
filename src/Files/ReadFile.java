package Files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {

    public static void main(String[] args) {
        try {
            File f =  new File("example.txt");
            Scanner myReader = new Scanner(f);
            while(myReader.hasNextLine()) { //pulling info from file (reading file)
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch(FileNotFoundException e) {
            System.out.println("An error has occured");
            e.printStackTrace();
        }
    }
}
