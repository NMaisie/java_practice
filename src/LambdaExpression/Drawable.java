package LambdaExpression;

interface Drawable {
    public void draw();
}
class LambdaExpressionExample {

    public static void main(String[] args) {
        int width=10;

        //without lambda, Drawable implementation using anonymous class
        Drawable d=new Drawable(){
            public void draw(){
                System.out.println("Anonymous: Drawing "+width);}
        };
        d.draw();

        //with lambda
        Drawable d2=()->{
            System.out.println("Lambda expression: Drawing "+width);
        };
        d2.draw();

    }
}