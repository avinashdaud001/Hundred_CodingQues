import java.util.Arrays;

public class divide_array {
    public static int divide(int[] arr1, int[] arr2) {
        int m = arr1.length;
        int n = arr2.length;
        int sum = m + n;
        int[] arr = new int[sum];
        int count = 0;
        for (int i = 0; i < m; i++) {
            arr[count] = arr1[i];
            count++;
        }
        for (int i = 0; i < n; i++) {
            arr[count] = arr2[i];
            count++;
        }
        Arrays.sort(arr);
        if (sum % 2 == 0) {
            double ans;
            ans = (double) ((arr[sum / 2 - 1] + arr[sum / 2]) / 2.0);
            return (int) ans;
        } else {
            return (int) arr[sum / 2];
        }
    }



    public static void main(String[] args) {
        int a[]={1,2,3};
        int b[]={3,4,5,};
        System.out.println(divide(a,b) );
    }
}

