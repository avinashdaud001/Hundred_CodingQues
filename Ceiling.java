public class Ceiling {
    static int Search(int []arr,int target){
        int start=0;
        int end=arr.length-1;
        while(start<end) {
            int mid = start + (end - start) / 2;


            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {


                start = mid + 1;
            } else {
                return mid;
            }




        }
        return start;
    }
    public static void main(String[] args) {
        int arr[]={11,12,13,15,16};
        int target=14;
        System.out.println(Search(arr,target));
    }
}
