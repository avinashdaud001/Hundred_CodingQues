public class Search_RotatedArray {

        public static int search(int[] nums, int target) {
            int pivot = nums[0];
            int n = nums.length;

            if (target < pivot){
                int r = n-1;
                while(true){

                    if (r>=0 && nums[r] == target){
                        return r;
                    }

                    if (r < 0 || nums[r] < target) {
                        return -1;
                    }

                    r--;

                }
            }else if (target > pivot){

                int l = 1;

                while(true){

                    if (l <= n-1 && nums[l] == target){
                        return l;
                    }

                    if (l>= n || nums[l] > target){
                        return -1;
                    }

                    l++;

                }


            }else if (target == pivot) return 0;
            return -1;

        }

    public static void main(String[] args) {
        int ar[]={4,5,6,7,0,1,2};
        int target=0;
        search(ar,target);
    }
    }




