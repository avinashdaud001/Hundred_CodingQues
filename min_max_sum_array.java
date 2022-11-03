
    import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


        public class min_max_sum_array {

            /*
             * Complete the 'miniMaxSum' function below.
             *
             * The function accepts INTEGER_ARRAY arr as parameter.
             */

            public static void miniMaxSum(List<Integer> arr) {
                Collections.sort(arr);
                // Write your code here
                int min = 0;
                int max = 0;
                for (int i = 0; i < arr.size() - 1; i++) {
                    min += arr.get(i);
                }
                for (int i = 1; i < arr.size(); i++) {
                    max += arr.get(i);
                }
                System.out.print(min+" ");
                System.out.println(max);

            }



                public static void main(String[] args) throws IOException {
               Scanner avi=new Scanner(System.in);
                    System.out.println("enter array size");
                    int n=avi.nextInt();
                    System.out.println("enter array value");
                    int ch[]=new int[n];
                    for (int i = 0; i < n; i++) {
                        ch[i]=avi.nextInt();
                    }




                    List<Integer> arr = new ArrayList<>();

                    for (int i = 0; i < n; i++) {

                        arr.add(ch[i]);
                    }

                    min_max_sum_array.miniMaxSum(arr);

                }
            }



