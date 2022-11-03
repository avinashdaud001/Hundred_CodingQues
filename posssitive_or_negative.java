import java.util.Scanner;

public class posssitive_or_negative {
    public static void main(String[] args) {
        System.out.println("enter no that you want to check possitive or negative");
        int n;
        Scanner avi=new Scanner(System.in);
        n=avi.nextInt();
        if(n>0){
            System.out.println(n+ " "+"is positive");
        }
        else {
            System.out.println(n +""+"is negative");
        }

    }
}
