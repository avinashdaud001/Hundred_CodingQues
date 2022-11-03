public class Minimize_sub_Array_sum {
    public static int minSubArrayLen(int target, int[] nums) {
        int length = Integer.MAX_VALUE;
        int sum = 0;
        int start = 0;

        for (int end = 0; end < nums.length; end++) {
            sum += nums[end];    // increase window to get a target value

            while (sum >= target) {
                length = Math.min(length, end - start + 1);  // compare minimum value
                sum -= nums[start];   // remove value from start
                start++;     // then shrink your window
            }
        }
        if (length == Integer.MAX_VALUE) {
            return 0;
        }
        return length;
    }

    public static void main(String[] args) {
        int b[]={2,3,1,2,4,3};
        int t=7;
        minSubArrayLen(t,b);
    }
}



