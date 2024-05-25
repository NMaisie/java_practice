package arrayList_linkedList;
// https://www.youtube.com/watch?v=Y0Kph3aEUpc
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class example1 {
    public static void main(String[] args) {
        List<Integer> numberList = new ArrayList<>(); // Because List is an interface, it's not a class so it cannt initialize it self, we need to create new ArrayList which is a class(object)

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int i = 0; i < num; i++) {
            numberList.add(sc.nextInt());

        }
//        for (int i = 0; i < numberList.size(); i++) {
//            System.out.print(numberList.get(i)+" ");
        for( int mm : numberList){
            System.out.print(mm);

        }
        //delete duplicate number
        List<Integer> newList = new ArrayList<>();
        for (int i = 0; i < numberList.size(); i++) {
            if(!newList.contains(numberList.get(i))){ // check every single element of numberList that contain inside newList yet, if not : add it in
                newList.add(numberList.get(i));

            }

        }
        System.out.println();
        System.out.print("New List: "+ newList+" ");
    }

}
