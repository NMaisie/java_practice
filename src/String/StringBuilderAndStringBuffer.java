package String;
// https://www.youtube.com/watch?v=RCV_Un6pcUQ
public class StringBuilderAndStringBuffer {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder();
        s.append("Hello ");
        s.append("Peter");


        String name = s.toString();// toString : convert StringBuilder to String
        System.out.println("apend: "+name);

        s.insert(5," and "); // insert " and " to index at 5
        String insertString = s.toString();
        System.out.println("insert "+ insertString);


    }

}
