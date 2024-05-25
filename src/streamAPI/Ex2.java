package streamAPI;
import java.util.List;;
import java.util.Arrays;
import java.util.stream.Stream;

public class Ex2 {
    public static void main(String[] args) {
        List<String> fruit =  Arrays.asList("mango","orange","strawberry");

        // Create an Empty Stream if the fruit list is null or empty
        Stream<String> fruitStream = (fruit != null && !fruit.isEmpty() ? fruit.stream() : Stream.empty());

        //print mỗi loại trái cây dưới dạng upperCase
        fruitStream.map(String :: toUpperCase)
        .forEach( System.out ::println);


        System.out.println();


        List<String> meat = Arrays.asList("beef", "pork", "chicken");

        // Create an Empty Stream if the fruit list is null or empty
        if (meat != null && !meat.isEmpty()) {
            for (String f : meat) {
                System.out.println(f.toUpperCase());
            }
        }
    }
}


