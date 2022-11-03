public class mountain_arr {
    static int search(int arr[],int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if ( target > arr[mid]) {
                start= mid+1;
            } else{
                end = mid ;


        }
    }


        return start;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,3,2};
        int target=3;
        System.out.println(search(arr,target));

    }
}
