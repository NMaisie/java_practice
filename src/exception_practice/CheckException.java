package exception_practice;

import java.io.FileNotFoundException;
import java.io.FileReader;

// https://www.youtube.com/watch?v=bCPClyGsVhc
public class CheckException {
    public static void main(String[] args) throws FileNotFoundException {
        readFile("myFile.txt");
    }
    /** Because FileNotFoundException is check exception so java warning error at compile time and you need to declare throws or using try-catch block**/
    public static void readFile(String fileName) throws FileNotFoundException {
      try{
          FileReader f = new FileReader(fileName);
      }catch (FileNotFoundException e){
          System.out.println("File not found");
      }
    }
}
// still work same without throws cause you handle it with try-catch block
  /*  public static void main(String[] args) throws FileNotFoundException {
        readFile("myFile.txt");
    }
    public static void readFile(String fileName) throws FileNotFoundException {
        try{
            FileReader f = new FileReader(fileName);
        }catch (FileNotFoundException e){
            System.out.println("File not found");
*/