package Lesson1;

public class Rectangle {
    double height = 2.5 , length;
    // double height =2.5
    // double length;
    double radius , circle ; // other way to declare it



    public static final int SS = 6;

    public static void main(String[] args) {

        double area = Math.pow(SS, 2); // 6^3  Calculate the area using Math.pow
        double len = Math.pow(2,3); // 2^3

        System.out.println("Area of the circle with radius " + SS + " is: " + area);
        System.out.println("len: "+ len);
    }


}
