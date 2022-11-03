public class target_in_ASC_DSC {


        static int Search(int [] arr,int target){
            int ans=0;
            int start=0;
            int end=arr.length-1;
            while(start<end){
                int mid=start+(end-start)/2;
                if( target<arr[mid+1]){
                    start=mid+1;
                }
                else{
                    end=mid;
                }

            }
            return end;
        }
        public static void main(String[] args) {
            int arr[]={1,2,3,4,5,4,3,2,1};
            int target=4;
            System.out.println(Search(arr,target));
        }
    }



