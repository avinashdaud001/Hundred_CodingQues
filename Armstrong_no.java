import java.util.Scanner;

public class Armstrong_no {
    public static void main(String[] args) {
        int n=0;
        Scanner avi=new Scanner(System.in);
        System.out.println(" enter number perfect or not ");
        n=avi.nextInt();
        int temp=n;
        int rem;
        int rev=0;
        while(temp!=0){
            rem=temp%10;
            rev=rev+(rem*rem*rem);
            temp=temp/10;
        }
        if(n==rev){
            System.out.println("armstrong number");
        }
        else{
            System.out.println("not armstrong number");
        }
    }
}
