import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        double n1,n2;
        int press;
        String operator;
        Scanner avi=new Scanner(System.in);
        do {
            System.out.println("enter n1 value");
            n1 = avi.nextInt();
            System.out.println("enter n2 value");
            n2 = avi.nextInt();
            System.out.println("choose operator given + - * /");
            operator = avi.next();

            switch (operator) {
                case "+":
                    System.out.println(n1 + n2);
                    break;
                case "-":
                    System.out.println(n1 - n2);
                    break;
                case "*":
                    System.out.println(n1 * n2);
                    break;
                case "/":
                    System.out.println(n1 / n2);
                    break;
                default:
                    System.out.println("please choose valid operation ");

            }
            System.out.println("do you want to continue then press 1");
            press= avi.nextInt();
        }while(press!=0);

    }
}
