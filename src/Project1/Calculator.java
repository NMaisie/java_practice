package Project1;

public class Calculator {
    int a;
    int b;

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {

        if (a < b) {
            int temp = a;
            a = b;
            b = temp;
        } else {
        }
            return a - b;
        }

public int multiply( int a, int b){
        return a*b;
}
public double add( double a, double b) {// overload add method take double argument
        return a+b;
}
public int sum (int ...arr) {
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
        sum += arr[i];
    }

    return sum;
}
public int sum( int a, int b){
        return a-b;
}

    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println("Add "+ c.add(5,3.5)); // adding int
        System.out.println("Add "+c.add(53.4,4.3)); // adding double
        System.out.println(c.sum(1,2));
        System.out.println(c.sum(1,2,3));
    }}