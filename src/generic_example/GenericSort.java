package generic_example;

public class GenericSort {
    public static void main(String[] args) {
        Integer[] intArray = {2, 4, 3};
        mysort(intArray);
        printlist(intArray);


    }

    public static <E extends Comparable<E>> void mysort(E[] mylist) {
        E currentMin;
        int currentMinIndex;

        for (int i = 0; i < mylist.length; i++) {

            currentMin = mylist[i];
            currentMinIndex = i;

            for (int j = i + 1; j < mylist.length; j++) {
                if (currentMin.compareTo(mylist[j]) > 0) {
                    currentMin = mylist[j];
                    currentMinIndex = j;

                }
            }

                if (currentMinIndex != i) {
                    mylist[currentMinIndex] = mylist[i];
                    mylist[i] = currentMin;
                }
            }

        }
        public static void printlist (Object[]mylist){
            for (int i = 0; i < mylist.length; i++) {
                System.out.print(mylist[i] + " ");
            }
        }
    }