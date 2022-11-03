import java.util.Arrays;
import java.util.Scanner;

public class Found_duplicate {

    public boolean containsDuplicate(int[] nums) {


        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j])
                    return true;


            }

        }
        return false;
    }



    public static void main(String[] args)  {
        int arr[] = new int[5];

        Scanner avi = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            arr[i] = avi.nextInt();
        }
        Found_duplicate h = new Found_duplicate();
        System.out.println(h.containsDuplicate(arr));
//h.containsDuplicate(arr);
    }
}
