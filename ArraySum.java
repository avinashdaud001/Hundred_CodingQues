class  Solu {
    public int[] twoSum(int[] nums, int target) {
        int b[] = new int[0];
        int count=0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    count++;

                   b= new int[]{i, j};
                }
            }

        }
        System.out.println(count);

        return b;
    }


}
public class ArraySum {
    public static void main(String[] args) {

        Solu   avi=new Solu();
        int [] a={1,2,4,5,6};

        System.out.println( avi.twoSum(a,10));

    }
}
