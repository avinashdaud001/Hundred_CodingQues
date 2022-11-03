public class floor {
    static int Search(int arr[],int target){
        int start=0;
        int end=arr.length-1;
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

        return end;
    }
    public static void main(String[] args) {
        int arr[]={12,13,14,15,17,18};
        int target=16;
        System.out.println(Search(arr,target));
    }
}
