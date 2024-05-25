package Lesson1;
// https://www.youtube.com/watch?v=Uq9-Zo2J-aY

import java.math.BigInteger;
import java.util.Scanner;

public class BigIntegerAndBigDecimal {
    public static void main(String[] args) {

        BigInteger num1 = new BigInteger("12345678901234567890123456789");
        BigInteger num2 = new BigInteger("3242431414");
        System.out.println("num1 * num2: " + num1.multiply(num2));

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int n = sc.nextInt();
        System.out.println(n + " factorial is : " + BigIntegerfactorial(n));
    }

    public static BigInteger BigIntegerfactorial(long n) {
        BigInteger result = BigInteger.ONE; // BigInteger("1");
        for (int i = 1; i <= n; i++)
            result = result.multiply(BigInteger.valueOf(i));
        return result;

    }
}
