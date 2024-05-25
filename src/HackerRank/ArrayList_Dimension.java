package HackerRank;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList_Dimension {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numList = sc.nextInt();

       // ArrayList<Integer> arr = new ArrayList<>();
        ArrayList[] arr = new ArrayList[20000];
        for (int i = 0; i < numList; i++) {
            arr[i] = new ArrayList();
            int  number = sc.nextInt();
            for (int j = 0; j < number; j++) {
                int value = sc.nextInt();
                arr[i].add(value);

            }
        }
        int queries = sc.nextInt();
        for (int i = 0; i < queries; i++) {
            int row = sc.nextInt();
            int column = sc.nextInt();
            try {
                System.out.println(arr[row - 1].get(column - 1));
            } catch (Exception e) {
                System.out.println("ERROR");
            }
        }
    }
}