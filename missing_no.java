import java.util.Scanner;

public class missing_no {

        public int missingNumber(int[] nums) {
            int len=nums.length;
            int ad=0;
            int sum=0;
            int n=len+1;
            ad=n*(n+1)/2;
            for(int i=0;i<len;i++){
                sum+=nums[i];

            }
            return  ad-sum;
        }

    public static void main(String[] args) {
        int arr[]=new int[3];

        Scanner avi=new Scanner(System.in);
        for(int i=0;i<3;i++){
            arr[i]=avi.nextInt();
        }
        missing_no g=new missing_no();
        System.out.println(g.missingNumber(arr));


    }
    }


