import java.util.Scanner;

public class MoveZero_end {

        public void moveZeroes(int[] nums) {
            int c=0;
            int n=nums.length;
            for(int i=0;i<n;i++){
                if(nums[i]!=0){
                    nums[c++]=nums[i];
                }
            }
             while(c<n){
                 nums[c++]=0;
             }
            for(int i=0;i<5;i++) {
                System.out.println(nums[i]);
            }

        }

    public static void main(String[] args) {
            int arr[]=new int[5];

        Scanner avi=new Scanner(System.in);
        for(int i=0;i<5;i++){
            arr[i]=avi.nextInt();
        }
        MoveZero_end b=new MoveZero_end();
        b.moveZeroes(arr);

    }


    }

