package exception_practice;

public class UnCheckException {
    public static void main(String[] args) {
        //String name = "John"; // run fine

        /**  Will throw a NullPointerException: because Null.. uncheck exception so Java does not
         *  warning you to throws exception, but when you run it will show error at output**/
        String name = null;
        printLength(name);
    }

    public static void printLength(String stringLength) {
        System.out.println(stringLength.length());
    }
}
