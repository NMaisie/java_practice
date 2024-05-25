package String;

public class ExString {
    public static void main(String[] args) {

        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter three words separated by spaces: ");// whats is this about
        String s1 = input.next(); // Read a word
        String s2 = input.next();
        String s3 = input.next();

        String s4 = s1.concat(s2); // s1+s2


        System.out.println("s1 is " + s1);
        System.out.println("s2 is " + s2);
        System.out.println("s3 is " + s3);
        System.out.println("s4 is " + s4);

        System.out.println("charAt(3) "+s1.charAt(3));// get the third character of s1 (only)
        System.out.println("length() "+s1.length());// length of s1 (only)
        System.out.println("toUpperCase() "+ s1.toUpperCase());

        String s5 = "        Hello"; // use trim() to remove space infront Hello
        System.out.println("trim() "+ s5.trim());

        System.out.println("___");

        String name1 = "Alice";
        String name2 = "Alice";
        String name3 = "aliceddddd";
        System.out.println(name1.equals(name2)); // true (same characters Alice-Alice)
        System.out.println(name1.equals(name3)); // false (different Alice - alicedddd)
        System.out.println(name1.equalsIgnoreCase(name2));// true (ignore case)


    }
}