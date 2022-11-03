import java.util.Scanner;

public class Find_peek_No {

        public int findPeakElement(int[] nums) {


            int max=0;
            for(int i=0;i<nums.length;i++) {
                if (nums[i] > nums[max]) {
                    max = i;
                }
            }








                return max;

        }

    public static void main(String[] args) {
        int arr[]=new int[4];

        Scanner avi=new Scanner(System.in);
        for(int i=0;i<4;i++){
            arr[i]=avi.nextInt();
        }
      Find_peek_No n=new Find_peek_No();
        System.out.println( n.findPeakElement(arr));



    }


}





