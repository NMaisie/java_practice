package file_class;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileFuntion {
    public static void main(String[] args) {
        File inputFile = new File("/Applications/SumerJava/src/file_class/pricelist.txt");
        if(inputFile.exists()) {
            System.out.println("File exist");
            System.out.println(inputFile.getAbsolutePath());
            System.out.println(inputFile.length());


            try {
                FileWriter fw = new FileWriter("/Applications/SumerJava/src/file_class/poem.txt");
                fw.write("Hello");
                fw.append(" ,Wellcome!!!");
                fw.write(" \nLaaaaa");
                fw.close();
            } catch (IOException e) {
             e.printStackTrace();
        }
        }}}
