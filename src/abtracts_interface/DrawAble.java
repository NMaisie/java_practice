package abtracts_interface;

public interface DrawAble {
    void draw();
}
interface ResizeAble {
    void resize();
}
 abstract class Shape implements DrawAble,ResizeAble {
     abstract double calculateArea();

     @Override
     public void draw() {
         System.out.println("Drawing shape ....");
     }
 }
     class Cicle extends Shape {
         private double radius;

         public Cicle(double radius) {
             this.radius = radius;
         }

         public double getRadius() {
             return radius;
         }

         public void setRadius(double radius) {
             this.radius = radius;
         }

         @Override
         public void resize() {

         }

         @Override
         double calculateArea() {
             return Math.PI * Math.sqrt(radius);
         }



         public static void main(String[] args) {
             DrawAble c = ()-> {
                 System.out.println("JJJ" );
             };
             c.draw();
         }
     }
