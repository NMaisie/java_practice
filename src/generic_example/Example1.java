package generic_example;

public class Example1 {
    public static void main(String[] args) {
        Integer[] printMyInt = {1,2,3,4,5};
        String[] printMyString = {"Apple","Mango","Banana"};

        printOut(printMyString);
        printOut(printMyInt);
      //  Example1.printOut(myInt);

    }
    public static <E> void printOut(E[] myList){ //<E>  means that it can accept an array of any reference type.
        for (int i = 0; i <myList.length; i++) {
            System.out.print(myList[i] + " ");
        }System.out.println();
    }
}


