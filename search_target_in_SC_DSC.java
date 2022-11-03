public class search_target_in_SC_DSC {
    static int searchTarget(int arr[],int target) {
        int peak = peak(arr);
        int ASC = searchASC(arr, target, 0, peak);
        int DSC = searchDSC(arr, target, peak + 1, 0);

        if (DSC != -1) {
            return ASC;
        }
//        if(DSC!=-1){
//            return DSC;
//        }
//        return -1;
//    }
        return -1;
    }
    static int searchASC(int arr[],int target,int start,int end) {

        while (start < end) {
            int mid = start + (end - start) / 2;
            if ( target > arr[mid]) {
                start= mid+1;
            } else if(target<arr[mid]){
                end = mid-1 ;


            }
            else{
                return mid;
            }
        }


        return -1;
    }
    static int searchDSC(int arr[],int target,int start,int end) {

        while (start < end) {
            int mid = start + (end - start) / 2;
            if ( target < arr[mid]) {
                start= mid+1;
            } else if(target>arr[mid]){
                end = mid-1 ;


            }
            else{
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
    public static void main(String[] args) {
        int  arr[]={1,2,3,4,6,5,3,2,1};
        int target=3;
        System.out.println(searchTarget(arr,target));
    }
}
