package streamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// tính tổng của các số chẵn từ một danh sách
public class EX1 {
    public static void main(String[] args) {
        /** using Arraylist to create a list of numbers take too many line of code **/
/*        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);        */

        /** Using List Arrays.aslist() **/

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);

        int sumOfEvenNumber = numbers.stream()  //Sử dụng stream() để chuyển danh sách thành một luồng (stream) của các phần tử.
                .filter(n-> n%2 ==0)  // Lọc ra các số chẵn
                .mapToInt(Integer :: intValue)  // Chuyển Stream<Integer> thành IntStream
                .sum();
        System.out.println("Sum of even number is: "+ sumOfEvenNumber);



        int sumOfOddNumber = numbers.stream()
                .filter(n-> n%2 !=0)
                .mapToInt(Integer :: intValue)
                .sum();
        System.out.println("Sum of odd number: "+ sumOfOddNumber);


    }

}
