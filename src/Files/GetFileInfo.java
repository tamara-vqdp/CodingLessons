package Files;

import java.io.File;

public class GetFileInfo {

    public static void main(String[] args) {
        File f = new File("example.txt");
        if(f.exists()) {
            System.out.println("File name: " + f.getName());
            System.out.println("Absolute path: " + f.getAbsolutePath());
            System.out.println("Writable: " + f.canWrite());
            System.out.println("Readable: " + f.canRead());
            System.out.println("File size in bytes: " + f.length());
        } else {
            System.out.println("This file does not exist");
        }
    }
}
