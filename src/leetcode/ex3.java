package leetcode;
import java.util.Scanner;
public class ex3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            String s1=sc.next();
            int x=sc.nextInt();
            //Complete this line
            System.out.printf("%-15s%03d%n",s1,x);
            // %-15s left-justified with trailing whitespace through the first  characters.
            // %03d and %n     each integer that was less than  digits now has leading zeroes.

        }
        System.out.println("================================");

    }
}
