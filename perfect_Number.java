import java.util.Scanner;
public class perfect_Number {


    public static void main(String args[]) throws Exception {

        int v = 3;
        do {

            int num;
            int sum = 0;
            Scanner avi = new Scanner(System.in);

            num = avi.nextInt();
            for (int i = 1; i < num; i++) {
                if (num % i == 0) {
                    sum += i;

                }
            }
            if (num == sum) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
            // Write your code here
            v--;

        } while (v > 0);
    }
}