package Lesson1;

// tinh tong so chan tu 0-10
public class StarPattern {
    public static void main(String[] args) {

        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
        for (int i = 4; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 12; i > 0; i--) {
            System.out.println(i);
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("*");
        }

        for (int i = 0; i < 10; i += 9) {
            System.out.println("@");
        }

        // tinh tong so chan tu 0-10
        int sum = 0;
        for (int i = 0; i <= 10; i += 9) { // i+=2 : i+2=i (run from i=0, i<=10 then each time it increment by 2)
            sum = i;
            System.out.println("i ");
        }


        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println(i + " " + j);
            }

        }
        for (int i = 1; i <= 10; i++) {
            System.out.print(i);
            if (i < 10) {
                System.out.print("+");


            }
        }

    }
}