package LambdaExpression;

public interface LambdaExpresstionWithReturn {
    int add(int a, int b);


    public static void main(String[] args) {
 /*        LambdaExpresstionWithReturn l = new LambdaExpresstionWithReturn() {

           public int add(int a, int b) {

                return a + b;
            }
        };

        int result = l.add(5, 6);
        System.out.println(result);       */

        LambdaExpresstionWithReturn l = ( a, b)-> a+b;
        int result = l.add(5, 6);
        System.out.println(result);
    }
}
