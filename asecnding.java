public class asecnding {
    static int ASC(int arr[], int target,int start,int end) {

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    static int peak(int arr[]){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(arr[mid]<arr[mid+1]){
                start=mid+1;
            }
            else{
                end=mid;
            }
        }
        return start;
    }
    static int findtarget(int arr[],int target ){
        int peak=peak(arr);
        int ASC=ASC(arr,target,0,peak);
        int DSC=ASC(arr,target,peak+1,arr.length-1);
        if(ASC!=-1){
            return ASC;
        }
        return DSC;
    }

    public static void main(String[] args) {


        int arr[] = {4,5,6,7,0,1,2};
        int target=2;
//        int target = 7;
//        int arr[]={5,4,3,2,1};
//       int target=3;
//        System.out.println(ASC(arr,target));
//        System.out.println(DSC(arr,target));
        System.out.println( findtarget(arr,target));
    }
}
