package generic_example;

public class Example2 {
    public static void main(String[] args) {
        Integer[] myInt = {1, 2, 3, 4, 5};
        String[] myString = {"Apple", "Mango", "Banana"};

        printMyInt(myInt);
        System.out.println();
        printMyString(myString);
        }

    public static void printMyString(String[] list) {
        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");

    }
    public static void printMyInt (Integer[] list ) {
        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");

    }
}