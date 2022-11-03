public class Product_ofArray_Self {

        public int[] productExceptSelf(int[] nums) {
            int product=1;
            int p[]=new int[nums.length];

            for(int i=0;i<nums.length;i++){
                product=product*nums[i];
            }
            for(int i=0;i<nums.length;i++){
                p[i]=product/nums[i];
            }

            return p;
        }

    public static void main(String[] args) {
        int ar[]={1,2,3,4};
        Product_ofArray_Self u=new Product_ofArray_Self();

        System.out.println( u.productExceptSelf(ar));
    }
    }


