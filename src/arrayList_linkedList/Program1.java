package arrayList_linkedList;

import generic_example.example6;
/** return the second largest element in ArrayList*/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Program1 {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>(Arrays.asList(5,9,3,7,8));
        System.out.println(secondLargest(myList));
    }
    public static int secondLargest( ArrayList<Integer> myList){

        return myList.size()<2?-1 : myList.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get(); //skip(1) mean : return myList.get(myList.size()-2)
        //        if(myList.size()<2){
//            return -1;
//        }else{
//         Collections.sort(myList, new Comparator<Integer>() {
//             @Override
//             public int compare(Integer o1, Integer o2) {
//                 return o2.compareTo(o1);
//             }
//         });
////            // 2 3 5 7 9
////            //9 7 5 3 2
////            //return myList.get(myList.size()-2);
////            return myList.get(1);
////        }
//        return myList.size()<2 ? -1 : myList.get(1);
    }
}

/*     if (myList.size() < 2) {
            return -1;
        } else {
            Collections.sort(myList, Comparator.reverseOrder());
            return myList.get(myList.size() - 2);
             }}*/


 /*       Collections.sort(myList,Comparator.reverseOrder());
        return myList.size()<2 ? -1 : myList.get(myList.size()-2);
        }
        }
    */


//  return myList.stream().sorted(Comparator.reverseOrder()).

      /*  Collections.sort(myList, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        return myList.get(myList.size()-2);
    }
}
*/




