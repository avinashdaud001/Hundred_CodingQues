import java.util.Scanner;

public class Found_Single_no {

        public int singleNumber(int[] nums) {
            int n=0;
            for(int i=0;i<nums.length;i++){
                n=n^nums[i];
            }
            return n;

        }


    public static void main(String[] args) {
        int arr[]=new int[5];

        Scanner avi=new Scanner(System.in);
        for(int i=0;i<5;i++){
            arr[i]=avi.nextInt();
        }
      Found_Single_no m=new Found_Single_no();
        System.out.println(m.singleNumber(arr));

    }
}
