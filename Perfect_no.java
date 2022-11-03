import java.util.Scanner;

public class Perfect_no {
    public static void main(String[] args) {
        int n=0;
        int sum=0;
        Scanner avi=new Scanner(System.in);
        System.out.println(" enter number perfect or not ");
        n=avi.nextInt();
        for(int i=1;i<n;i++){
            if(n%i==0){
              sum+=i;
            }
        }
        if(sum==n) {
            System.out.println("perfect number ");
        }
        else{
                System.out.println("not perfect");
            }
    }
}
