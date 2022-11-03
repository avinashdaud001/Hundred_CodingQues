public class find_peak_ASC_DSCArr {
    static int Search(int [] arr){
        int ans=0;
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
        return arr[start];
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,4,3,2,1};
            System.out.println(Search(arr));
        }
    }

