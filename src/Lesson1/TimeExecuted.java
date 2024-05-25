package Lesson1;
// time it take to run the program in millis
public class TimeExecuted {
    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();

        for (int i = 0; i < 10000; i++) {
            System.out.println(i);
        }
            long endTime = System.currentTimeMillis();

            double timeExecute = endTime - startTime;

            System.out.println("The time it take to execute: "+ timeExecute);

        }
    }
