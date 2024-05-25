package Lesson1;

public class Dog extends Animals {
    int size;
    leg leg;
    @Override
    public void eat() {

    }

    public Dog(){
        System.out.println(size);
        System.out.println(leg);
    }

    @Override
    public String toString() {
        return "Hi my name is dog";
    }
}
