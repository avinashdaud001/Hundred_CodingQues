
    import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

    public class Reverse_Number {

        public static void main(String[] args) {
            int i=3;
            do {

                int temp = 0;
                int rem;
                int sum = 0;
                int num = 0;
                int b = 0;
                int v;
                Scanner avi = new Scanner(System.in);

                num = avi.nextInt();
                b = avi.nextInt();

                temp = num;
                while (temp != 0) {
                    rem = temp % 10;
                    sum = sum * 10 + rem;
                    temp = temp / 10;
                }

//            System.out.println(sum);
                int total = sum + b;
                int x = total;
                int rev = 0;
                while (x != 0) {

                    rem = x % 10;
                    rev = rev * 10 + rem;
                    x = x / 10;
                }
                System.out.println(rev);

                i--;
                System.out.println();
            } while(i>0);
        }
    }







