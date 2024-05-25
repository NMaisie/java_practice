package String;

public class findsubSring {
    public static void main(String[] args) {
        String mainStr = "The weather today is hot";
        String searchStr = "today";

        System.out.println(mainStr.indexOf(searchStr));//return 12 because counting the index to today include space
    }
}
