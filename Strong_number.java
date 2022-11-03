import java.util.Scanner;

public class Strong_number {


        public static void main(String[] args) {
            int n=0;
            Scanner avi=new Scanner(System.in);
            System.out.println(" enter number perfect or not ");
            n=avi.nextInt();
            int temp=n;
            int rem;
            int rev=0;
            int re;
            while(temp!=0){
                re=1;
                rem=temp%10;

                for(int i=1;i<=rem;i++){
                   re=re*i;
                }
                rev=rev+ re;
                temp=temp/10;
            }
            if(n==rev){
                System.out.println("strong number");
            }
            else{
                System.out.println("not strong number");
            }
        }
    }


