import java .util.Scanner;
public class Leap_year {
    public static void main(String[] args) {
        int n=0;
        Scanner avi=new Scanner(System.in);
        System.out.println("enter year which you want to check leap year or not ");
        n=avi.nextInt();
        if(n%4==0||n%100==0){
            System.out.println("leap year");
        }
        else{
            System.out.println("not leap year");
        }
    }
}
