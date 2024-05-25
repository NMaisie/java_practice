package exception_practice;
import java.io.*;
public class ExceptionWithOverride {
    /** None exception**/
    /*void msg(){
        System.out.println("parent method");
    }
}

class TestExceptionChild5 extends ExceptionWithOverride {
    void msg() {
        System.out.println("child method");
    }

    public static void main(String args[]) {
        ExceptionWithOverride p = new TestExceptionChild5();

        try {
            p.msg();
        } catch (Exception e) {
        }

    }
}*/
/** Rule 1: If the superclass method does not declare an exception, subclass overridden method cannot declare the checked exception.**/
     /*   void msg() {
            System.out.println("parent method");
        }
    }

    public class TestExceptionChild extends ExceptionWithOverride {

        // overriding the method in child class with an exception gives compile time error

        void msg() throws IOException { // cannt throw checked exception here, only uncheck exception in subclass
            System.out.println("TestExceptionChild");
        }

        public static void main(String args[]) {
            ExceptionWithOverride p = new TestExceptionChild();
            p.msg();
        }
    }
}*/

/** Rule 2: If the superclass method does not declare an exception, subclass overridden method cannot declare the checked exception but can declare unchecked exception.**/
        void msg() {
            System.out.println("parent method");
        }
    }

    class TestExceptionChild1 extends ExceptionWithOverride{ // IOException is checked exception so will give error if declare in subclass
        void msg()throws StringIndexOutOfBoundsException {
            System.out.println("child method");
        }

        public static void main(String args[]) {
            ExceptionWithOverride p = new TestExceptionChild1();
            p.msg();
        }
    }


