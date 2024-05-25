package Lesson1;

public abstract class Animals {
    public abstract void eat();
    public Animals(){
        System.out.println("Animal");

    }

    public Animals(String name){
        System.out.println("Animals name"+ name);
    }

}
