package arrayList_linkedList;

import java.util.ArrayList;
import java.util.*;

public class example2 {
    public static void main(String[] args) {
        List<String> studentList = new ArrayList<>();

        while (true) {
            System.out.println(" 1. Add student name \n 2. Delete student name \n 3. Fix name \n 4. Print out all student name\n 5. Exit");
            Scanner sc = new Scanner(System.in);
            int selection = sc.nextInt();
            sc.nextLine(); // input String will not empty, tell the program there is newline to read

            if (selection == 5) { // if selection is 5 then program is out of while loop
                break;
            }
            switch (selection) {
                case 1:
                    System.out.println("Enter student name: ");
                    String studentName = sc.nextLine();
                    studentList.add(studentName);

                    while (!studentName.isEmpty()){
                        System.out.println("Enter student name: ");
                        studentName = sc.nextLine();

                        studentList.add(studentName);
                    }
                    break;
                case 2:
                    //remove name
                    studentList.remove(1);
                    System.out.println(studentList);
                    break;
                case 3:
                    // fix name
                     studentList.set(0, "Han");
                    System.out.println(studentList);
                    break;
                case 4:
                    System.out.println("-----All student name----- ");

                    for(String mm : studentList){ /** Vòng lặp lặp qua mỗi phần tử (String name) trong studentList **/
                        System.out.println(mm);
                    }
                    break;
                case 5:
                    break;
            }
        }
    }
}