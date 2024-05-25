package Lesson1;

public class Operator2 {
    public static void main(String[] args) {
        int a = 6;
        int b = a++;
        System.out.println(a);
        System.out.println(b); // b = a =6
        System.out.println();

        a = 6;
        b = ++a;
        System.out.println(a); //++a = 7
        System.out.println(b); // b = ++a =7
        System.out.println();

        char x = 'a';
        char y = 'c';
        System.out.println(++x); // b vì trong bảng chũ cái đếm lên ++
        System.out.println(y++); // c, print out y before increasing ++
        System.out.println();

        int i = 5;
        int j = 15;
        boolean c = (i > 10 && ((j = 20) > 10));
        System.out.println("b = " + c);  // false
        System.out.println("i = " + i);    // 5
        System.out.println("j = " + j);    // 15, ngắn mạch, because && so it only check the first condition i>10
        System.out.println();
        c = (i > 10 & ((j = 20) > 10));
        System.out.println("b = " + c);  // false
        System.out.println("i = " + i);    // 5
        System.out.println("j = " + j);    // 20, không ngắn mạch, because & so it check all condition include assign j = 20

        System.out.println("They said \"java\"");
    }
}
