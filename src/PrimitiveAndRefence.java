public class PrimitiveAndRefence {
    // Method to modify age (primitive type)
    public static void modifyPrimitiveAge(int age) {
        age = age + 1;
        System.out.println("Inside modifyPrimitiveAge: Age is " + age);
    }

    // Method to modify age (reference type)
    public static void modifyReferenceAge(Age ageObj) {
        ageObj.age = ageObj.age + 1;
        System.out.println("Inside modifyReferenceAge: Age is " + ageObj.age);
    }

    public static void main(String[] args) {
        // Primitive type
        int personAge = 25;
        System.out.println("Before calling modifyPrimitiveAge: Age is " + personAge);
        modifyPrimitiveAge(personAge);
        System.out.println("After calling modifyPrimitiveAge: Age is " + personAge);

        // Reference type
        Age ageObject = new Age(30);
        System.out.println("Before calling modifyReferenceAge: Age is " + ageObject.age);
        modifyReferenceAge(ageObject);
        System.out.println("After calling modifyReferenceAge: Age is " + ageObject.age);
    }
}

class Age {
    int age;

    public Age(int age) {
        this.age = age;

    }
}
/*
Explanation:

      For the modifyPrimitiveAge method:
        Before calling the method, the age is 25.
        Inside the method, the age is modified to 26.
        After calling the method, the original age remains 25, as changes to the parameter age within the method do not affect the original variable personAge.
      For the modifyReferenceAge method:
        Before calling the method, the age is 30.
        Inside the method, the age is modified to 31 via the ageObj reference.
        After calling the method, the original age object's age is updated to 31, reflecting the change made within the method.
*/
