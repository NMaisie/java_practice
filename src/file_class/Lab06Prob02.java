package file_class;
import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Lab06Prob02 {
    public static void main(String[] args) {
        File inputFile = new File("/Applications/SumerJava/src/file_class/pricelist (1).txt");
        DecimalFormat df = new DecimalFormat("$00.00"); // does not work with #,   DecimalFormat df = new DecimalFormat("'#'00.00");   output: #123.45


        try {
            Scanner scan = new Scanner(inputFile);
            while (scan.hasNextLine()) { // checks if there is another line available in the scanner
                String readString = scan.nextLine();//Read the content of the line(it reading String)  -- not using hasNextLine() cause inside String.valueOf() which doesn't convert the actual content of the line to a string. Instead, it checks if there is another line available in the scanner, which is not what you want. You should use scan.nextLine() directly to get the content of each line as a string.
                double stringTodouble = Double.parseDouble(readString);//  Convert the String to double
                System.out.println(df.format(stringTodouble)); //Format and print the price
            }
            scan.close();

        } catch (FileNotFoundException e) {
            //e.printStackTrace();
            System.out.println("File not Found "+ e.getMessage()); // getMessage() contains information about the file that couldn't be found or why it couldn't be found.
        }


    }
}