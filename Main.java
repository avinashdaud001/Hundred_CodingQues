import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

int userNumber;
        int Mynumber = (int) (Math.random() * 25);
        Scanner sc =new Scanner(System.in);
    do {
        System.out.println("enter your guess number");
        userNumber = sc.nextInt();
        if (userNumber == Mynumber) {
            System.out.println("woowh its crrect");
        } else if (userNumber > Mynumber) {
            System.out.println("your no is too large");

        } else {
            System.out.println("your no is too small");
        }
    }
    while(userNumber>=0);


    }
}
