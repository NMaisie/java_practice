package file_class;
// https://www.youtube.com/watch?v=lHFlAYaNfdo

import java.io.*;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Lab06Prob03 {
    public static void main(String[] args) throws IOException {
        File inputFile = new File("/Applications/SumerJava/src/file_class/pricelist (1).txt");

        DecimalFormat df = new DecimalFormat("00.00"); // does not work with #,   DecimalFormat df = new DecimalFormat("'#'00.00");   output: #123.45


        try {
            Scanner scan = new Scanner(inputFile);
            PrintWriter printWriter = new PrintWriter("/Applications/SumerJava/src/file_class/pricelist (1).txt-lab06.txt");

            while (scan.hasNextLine()) { // checks if there is another line available in the scanner
                String readString = scan.nextLine();//Read the content of the line(it reading String)  -- not using hasNextLine() cause inside String.valueOf() which doesn't convert the actual content of the line to a string. Instead, it checks if there is another line available in the scanner, which is not what you want. You should use scan.nextLine() directly to get the content of each line as a string.
                double price = Double.parseDouble(readString);//  Convert the String to double

                if (price < 50) {
                    price *= 1.0625;
                } else if (price >= 50 && price <= 100) {
                    price *= 1.125;
                } else {
                    price *= 1.25;
                }
                printWriter.println(df.format(price));
                //System.out.println(df.format(price)); //Format and print the price
            }
            scan.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not Found " + e.getMessage()); // getMessage() contains information about the file that couldn't be found or why it couldn't be found.
        }

    }
}
