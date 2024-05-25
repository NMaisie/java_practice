package leetcode;

import java.io.File;
import java.io.IOException;

public class CreateAFile {
    public static void main(String[] args) {

        File newFile = new File("test.txt");

        try {
            if (newFile.createNewFile()) {
                System.out.println("File successfully created");
            } else {
                System.out.println("File already exist");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}