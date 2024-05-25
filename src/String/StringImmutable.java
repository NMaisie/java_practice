package String;

public class StringImmutable {
    public static void main(String[] args) {
        String a = "Hello";
        String b = "Hello";
        String c = " yooooo";
        String x = new String("fat");

        System.out.println(a==b);
        System.out.println(a==c);
        System.out.println(a==x);
        System.out.println(a.equals(b));
        System.out.println(a.compareTo(b));

    }
}
