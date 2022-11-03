import java.util.Scanner;

public class Search_Rotated_arr {

        public int search(int[] nums, int target) {
            int start = 0;
            int end = nums.length - 1;

            while(start < end){

                int mid = start + (end - start) / 2;

                if(nums[mid] > nums[end]){
                    start = mid + 1;
                }else{
                    end = mid;
                }

            }

            int pivot = start;
            start = 0;
            end = nums.length - 1;


            if(target >= nums[pivot] && target <= nums[end]){
                start = pivot;
            }else{
                end = pivot;
            }

            while(start <= end){

                int mid = start + (end - start) / 2;

                if(nums[mid] == target){
                    return mid;
                }else if(nums[mid] < target){
                    start = mid + 1;
                }else{
                    end = mid - 1;
                }
            }


            return -1;

        }

    public static void main(String[] args) {
        int ab[]=new int[7];
        int target=0;

        Scanner avi=new Scanner(System.in);
        for(int i=0;i<7;i++){
            ab[i]=avi.nextInt();
        }
        Search_Rotated_arr v=new Search_Rotated_arr();
        System.out.println(v.search(ab,target));



    }


}



