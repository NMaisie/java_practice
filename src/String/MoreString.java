package String;

public class MoreString {
    public static void main(String[] args) {
        String s1 = " Hello! ";
        String s2 = new String (" Welcome "); // calling String constructor
        System.out.println("Replace Hello to : "+ s1.replace('e','@'));
        System.out.println("Hello to lowercase: "+ s1.toLowerCase());
    }
}
