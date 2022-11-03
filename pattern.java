import java.util.Scanner;
public class pattern {
    public static void main(String[] args) {
        int i,j,k;
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the value n: ");
        int n= sc.nextInt();

        for(i=n;i>0;i--){
            for(k=1;k<n-i;k++){
                System.out.print(" ");
            }
            System.out.print("*");
            for(j=0;j<=i-1;j++){
                System.out.print("-");
            }
            for(j=1;j<i;j++){
                System.out.print("-");
            }
            if(i>0){
                System.out.print("*");
            }
            System.out.println("");
        }

        for(i=1;i<=n;i++){
            for(k=1;k<n-i;k++){
                System.out.print(" ");
            }
            System.out.print("*");
            for(j=0;j<=i-1;j++){
                System.out.print("-");
            }
            for(j=1;j<i;j++){
                System.out.print("-");
            }
            if(i>0){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
