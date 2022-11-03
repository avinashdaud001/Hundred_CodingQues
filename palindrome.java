
public class palindrome {
    public static void main(String[] args) {
        palindrome avi=new palindrome();
        System.out.println( avi.pali(121));

    }

    public boolean pali(int a) {
        int rem;
        int sum=0;
        int temp=a;
        while(temp!=0){
            rem=temp%10;
            sum=(sum*10)+rem;
            temp=temp/10;

        }
        return a==sum;


    }
}
