package String;

public class Substring {
    public static void main(String[] args) {
        String str = "Hello, world!";

        // Lấy một phần của chuỗi từ vị trí 7 đến hết chuỗi
        String substring1 = str.substring(7);
        System.out.println("Substring 1: " + substring1);  // Kết quả: world!

        // Lấy một phần của chuỗi từ vị trí 0 đến trước vị trí 5 (không bao gồm vị trí 5)
        String substring2 = str.substring(0, 5);
        System.out.println("Substring 2: " + substring2);  // Kết quả: Hello

        String mainStr = "The weather today is hot";
        String searchStr = "today";
        System.out.println("mainStr.indexOf(searchStr) "+mainStr.indexOf(searchStr));//return index: 12 because counting the index to today include space

    }
}
