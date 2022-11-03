import java.util.Arrays;
import java.util.Scanner;

public class parse_int {
    public static void main(String[] args) {
        int n;
        System.out.println("enter array size ");
        Scanner avi = new Scanner(System.in);
        n = avi.nextInt();
        int[] arr = new int[n];
        System.out.println("enter array elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = avi.nextInt();
        }
        int sum[] = cumulativeSum(arr);
        System.out.println("cumulative Sum =" + Arrays.toString(arr));
    }

    public static int[] cumulativeSum(int[] arr) {
        int sum=0;
        for(int i=0;i< arr.length;i++){
            sum +=arr[i];
            arr[i]=sum;
        }
      return arr;


    }
}

