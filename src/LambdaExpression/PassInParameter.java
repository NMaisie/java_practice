package LambdaExpression;

public interface PassInParameter {
    void show(int i, double b);


    public static void main(String[] args) {
        PassInParameter a = ( i, b) -> System.out.println("Number " + i + " "+ b);
        a.show(5, 6.30);
    }
}