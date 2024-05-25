public class StackTraceExample {
    public static void main(String[] args) {
        method1();
    }
    public static void method1(){
        method2();
        method3();
    }
    public static void method2(){
        // dont call anything
    }
    public static void method3(){
        method4();
        method5();
    }
    public static void method4(){
        System.out.println("Sam..");
        double a = 5/0;
        System.out.println("Done....");
    }
    public static void method5(){
        // dont call anything
    }
}
