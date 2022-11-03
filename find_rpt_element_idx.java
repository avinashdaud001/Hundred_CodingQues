import java.util.Arrays;

public class find_rpt_element_idx {
    static int[] searchidx(int ar[],int target){
        int ans[]={-1,-1};
        int start=search(ar,target,true);
        int end=search(ar,target,false);
        ans[0]=start;
        ans[1]=end;
        return ans;
    }
    static int search(int arr[],int target, boolean findidx ){
        int start=0;
        int ans=-1;

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
                ans=mid;
                if(findidx){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[]={1,2,5,5,6,9,10};
        int target=2;
       System.out.println(Arrays.toString(searchidx(arr,target)) );

    }
}
