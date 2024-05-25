package leetcode;
import java.util.*;
public class java_static_intialize {
    public static int B;
    public static int H;
    static boolean flag = true;

    static{
        Scanner sc = new Scanner(System.in);
        B = sc.nextInt();
        H = sc.nextInt();
        sc.close();

        try{
            if(B<=0 || H<=0){
                throw new Exception("Breadth and height must be positive");
            }
        }catch(Exception e){
            System.out.println(e);

            System.exit(0); // if dont exit, it will continues the main method below

            /**System.exit(0);
             Dòng này được đặt trong khối catch để đảm bảo rằng nếu có một ngoại lệ xảy ra (trong trường hợp này, nếu các giá trị đầu vào không dương), chương trình sẽ kết thúc ngay lập tức.

             Đây là một cách để đảm bảo rằng nếu các giá trị đầu vào không hợp lệ, chương trình không tiếp tục thực thi. Vì chương trình không thể tính toán diện tích với các giá trị không dương cho chiều rộng và chiều cao, việc kết thúc chương trình tại điểm đó là hợp lý.

             Nếu bạn không kết thúc chương trình (System.exit(0);), nó sẽ tiếp tục thực thi sau khi gặp ngoại lệ. Tùy thuộc vào thiết kế của chương trình, điều này có thể dẫn đến hành vi không mong muốn hoặc kết quả không chính xác.*/
        }

    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        if(flag){
            int area = B*H;
            System.out.println(area);
        }
    }
}

