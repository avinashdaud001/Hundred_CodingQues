public class without_len_find_tar {
    static int searchlLen(int arr[],int target){
        int start=0;
        int end=1;
        while(target>arr[end]){
            int nStart=end+1;
            end=(end-start+1)*2;
            start=nStart;
        }
        return search(arr,target,start,end);
    }
    static int search(int arr[],int target,int start,int end){
        while(start<=end){
            int mid=start+(end-start)/2;

            if(target<arr[mid]){
                end=mid-1;
            }
            else if(target>arr[mid]){
                start=mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={12,13,14,15,16,17,18};
        int target=13;
        System.out.println(searchlLen(arr,target));
    }
}
