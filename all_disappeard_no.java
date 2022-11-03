import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class all_disappeard_no {


        public List<Integer> findDisappearedNumbers(int[] nums) {
            List<Integer> list=new ArrayList<>();
            for(int i=0;i<nums.length;){
                int temp=nums[i];
                if(temp!=nums[temp-1]){
                    nums[i]=nums[temp-1];
                    nums[temp-1]=temp;
                }else{
                    i++;
                }
            }

            for(int i=0;i<nums.length;i++){
                if(nums[i]!=i+1){
                    list.add(i+1);
                }
            }
            return list;
        }


    public static void main(String[] args) {
        int arr[]=new int[8];

        Scanner avi=new Scanner(System.in);
        for(int i=0;i<8;i++){
            arr[i]=avi.nextInt();
        }
        all_disappeard_no i=new all_disappeard_no();
      System.out.println( i.findDisappearedNumbers(arr));

    }
}


