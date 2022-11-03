import java.util.Scanner;

public class Largest_no_using_ternory_operator {
    public static void main(String[] args) {
        int n1,n2,n3;
        Scanner avi=new Scanner(System.in);
        System.out.println("enter n1 value");
        n1= avi.nextInt();
        System.out.println("enter n2 value");
        n2= avi.nextInt();
        System.out.println("enter n3 value");
        n3 = avi.nextInt();
        int temp=n1>n2?n1:n2;
        int result=temp>n3?temp:n3;
        System.out.println(result);
    }
}
