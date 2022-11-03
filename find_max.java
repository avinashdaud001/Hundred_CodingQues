public class find_max {
    static int  Search(int arr[],int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target>arr[mid]){
                end=mid;
            }
            else if(target<arr[mid]){
                start=mid;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={19,15,14,12,13};
        int target=15;
        System.out.println(Search(arr,target));
    }
}
