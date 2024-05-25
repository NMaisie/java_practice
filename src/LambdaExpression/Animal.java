package LambdaExpression;

import Lesson1.Dog;

public interface Animal {
    void eat();

    public static void main(String[] args) {

        Animal cat = () -> System.out.println("Strawberry");
        System.out.println("Pizza");
        cat.eat();
// because the statement is not in the curly braces so it run Pizza then call the lambda method

        System.out.println();
// because statement is inside curly braces that why the output is called in order
    Animal dog = () -> {
        System.out.println("Strawberry");
        System.out.println("Pizza");
    };
        dog.eat();
                }

                }

//class Cat implements Animal {
//    @Override
//    public void eat() {
//        System.out.println("Cat is eating");
//    }


//    public static void main(String[] args) {
//       Cat cat1 = new Cat();
//       cat1.eat();
//
//
//
//        // With anonymous function, create makeNoise method and use imediatly
//        Cat anonymousCat = new Cat(){
//            public void eat() {
//                System.out.println("Banana");
//            }
//        };
//        anonymousCat.eat();
//    }

