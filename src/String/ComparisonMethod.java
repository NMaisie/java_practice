package String;

import java.util.ArrayList;

public class ComparisonMethod {
    public static void main(String[] args) {


        String name1 = "Alice";
        String name2 = "Alice";
        String name3 = "aliceddddd";
        String name4 = "haha";
        //equals()
        System.out.println(name1.equals(name2)); // true (same characters Alice-Alice)
        System.out.println(name1.equals(name3)); // false (different Alice - alicedddd)
        System.out.println(name1.equalsIgnoreCase(name2));// true (ignore case)

        System.out.println(name1.compareTo(name2)); //0 (two string is equal) Giải thích: name1 và name2 đều là "Alice", do đó chúng bằng nhau và name1.compareTo(name2) trả về 0
        System.out.println(name1.compareTo(name3)); // negative #(cause first string is less than second string) name1 là "Alice" và name3 là "aliceddddd". So sánh từ điển xem xét từng ký tự, ký tự A (chữ hoa) có mã ASCII nhỏ hơn ký tự a (chữ thường), vì thế name1.compareTo(name3) trả về một số âm, chỉ ra rằng "Alice" nhỏ hơn "aliceddddd".
        System.out.println(name4.compareTo(name3));// positive # (cause first string is greater than second)  name4 là "haha" và name3 là "aliceddddd". Khi so sánh từ điển, ký tự h (trong "haha") lớn hơn ký tự a (trong "aliceddddd"), do đó name4.compareTo(name3) trả về một số dương, chỉ ra rằng "haha" lớn hơn "aliceddddd".

        /** equals(): So sánh nội dung hai chuỗi, có phân biệt chữ hoa, chữ thường.
            equalsIgnoreCase(): So sánh nội dung hai chuỗi, không phân biệt chữ hoa, chữ thường.
            compareTo(): So sánh thứ tự từ điển của hai chuỗi, phân biệt chữ hoa, chữ thường, và trả về số âm, 0, hoặc số dương dựa trên sự so sánh. */

       // ArrayList
    }
}