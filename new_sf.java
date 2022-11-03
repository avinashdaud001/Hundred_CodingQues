public class new_sf {
    /**
     * // This is MountainArray's API interface.
     * // You should not implement it, or speculate about its implementation
     * interface MountainArray {
     *     public int get(int index) {}
     *     public int length() {}
     * }
     */

    class Solution {
        public int search(int[] nums, int target) {
            int peak=peak(nums);
            int first=binarysearch( nums,target,0, peak);
            if(first!=-1){
                return first;
            }
            return
                    binarysearch( nums,target,peak+1, nums.length-1);
        }



        int peak(int arr[]){
            int start=0;
            int end=1;
            while(start<=end){
                int mid=start+(end-start)/2;
                if(mid<end&&arr[mid]>arr[mid+1]){
                    return mid;
                }
                if(mid>start&&arr[mid]<arr[mid-1]){
                    return mid-1;
                }
                if(arr[mid]<=arr[start]){
                    end=mid-1;
                }

                else{
                    start=mid+1;
                }

            }
            return -1;
        }
        int binarysearch(int arr[], int target,int start,int end){

            while(start<=end){
                int mid =start+(end-start)/2;
                if(target>arr[mid]){
                    start=mid+1;
                }
                else if(target<arr[mid]){
                    end=mid-1;
                }
                else{
                    return mid;
                }

            }
            return -1;
        }
    }

}
