package exception_practice;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        // declare and initialize variables
        Scanner scanner = new Scanner(System.in);
        int num1 = 0, num2 = 0;
        char operation = 0;

        boolean error = false;

        // read in operands and operation from user
        System.out.print("Enter an integer (operand 1) and press Enter: ");
        num1 = scanner.nextInt();

        System.out.print("Enter an operation (+, -, /, *) and press Enter: ");
        operation = scanner.next().charAt(0);

        System.out.print("Enter an integer (operand 2) and press Enter: ");
        num2 = scanner.nextInt();

        // The result of the operation
        int result = 0;
        try {
            // Determine the operator
            switch (operation) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    result = num1 / num2;
                    break;
                default:
                    throw new InvalidCalcOperationException(operation);
            }

            // Display result
            System.out.printf("%d %c %d = %d\n", num1, operation, num2, result);

        } catch (InvalidCalcOperationException e) {
            error = true;
            System.out.println(e.getMessage());

        }finally {
            scanner.close();
            // close scanner when done
            System.out.print("The program is terminating");
            if(error=true){ //
                System.out.print(" because of an error");
            }
    }
}}


