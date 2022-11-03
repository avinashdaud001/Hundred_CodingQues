import java.util.Scanner;

public class neon_number {
    public static void main(String[] args) {
        int n=0;
        Scanner avi=new Scanner(System.in);
        System.out.println(" enter number perfect or not ");
        n=avi.nextInt();
        int sq=n*n;
        int rem;
        int sum=0;
        while(sq!=0){
            rem=sq%10;
            sum=sum+rem;
            sq=sq/10;
        }
        System.out.println(sum);
        if(n==sum){
            System.out.println("its neon number");
        }
        else{
            System.out.println("not neon number");
        }
    }
}
