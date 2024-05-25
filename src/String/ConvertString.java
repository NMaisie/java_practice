package String;

public class ConvertString {
    public static void main(String[] args) {
        String numberStr = "123";
        int number = Integer.parseInt(numberStr); // number sẽ là 123
        double decimal = Double.parseDouble("3.14"); // decimal sẽ là 3.14
        System.out.println(number);
        System.out.println(decimal);

        int numb = 123;
        String Str = String.valueOf(numb); // numberStr sẽ là "123"
        double d = 3.14;
        String decimalStr = String.valueOf(d); // decimalStr sẽ là "3.14"

    }
}
