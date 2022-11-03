import java.util.Scanner;

public class automorphic_number {
    public static void main(String[] args) {
        int n = 0;
        Scanner avi = new Scanner(System.in);
        System.out.println(" enter number perfect or not ");
        n = avi.nextInt();
        int rem = 0;
        int sum = 0;
        boolean equal = false;

        int sq = n * n;
        while (sq != 0) {
            rem = sq % 10;
            if (n == rem) {
                equal = true;
                break;
            }
            sum = sum + rem;
            sq = sq / 10;

        }
        if (equal == true) {
            System.out.println("automrphic number");

        } else {
            System.out.println("not automorphic number");
        }
    }
}
