package Project1;

public class Shape {
    public void area(){//method area() that has no arguments

    }
}
class Rectangle extends Shape{
    double length;
    double width;

    public Rectangle(double length, double width){
        this.length=length;
        this.width = width;
    }
    @Override
    public void area() {
        double areaOfRectange = length*width;
        System.out.println("The area of rectangle is: "+ areaOfRectange);


    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle(5.4,45.6);
        r.area();
    }}
