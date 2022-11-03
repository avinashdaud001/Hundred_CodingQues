import java.util.Scanner;

public class Atm {
    private double bal=10000;
    private int pwd;
    double money;
    void withdraw(){
        System.out.println("enter password");
        Scanner avi =new Scanner(System.in);
        pwd =avi.nextInt();
        if(pwd==8264){
            System.out.println("enter amount ");
            money=avi.nextDouble();
            if(money<=bal) {
                bal = bal - money;
                System.out.println("withdraw money" + " " + money);
                System.out.println("total balance" + " " + bal);
            }
            else{
                System.out.println("insufficient balance");
            }
        }
        else{
            System.out.println("invalid password");
        }
    }
    void Deposite(){
        System.out.println("enter password");
        Scanner avi =new Scanner(System.in);
        pwd =avi.nextInt();
        if(pwd==8264){
            System.out.println("enter amount ");
            money=avi.nextDouble();

                bal = bal + money;
                System.out.println("withdraw money" + " " + money);
                System.out.println("total balance" + " " + bal);
            }


        else{
            System.out.println("invalid password");
        }
    }
    void check_Bal(){
        System.out.println("enter password");
        Scanner avi =new Scanner(System.in);
        pwd =avi.nextInt();
        if(pwd==8264){
            System.out.println("total balance"+" "+bal);
        }
        else{
            System.out.println("invalid password");
        }
    }

    public static void main(String[] args) {
        Atm s=new Atm();
        System.out.println("press 1 for withdraw");
        System.out.println("press 2 for Depposite");
        System.out.println("press 3 for balance enquiry");

        System.out.println("please enter your choice");
        Scanner avi=new Scanner(System.in);

        int ch;
        ch=avi.nextInt();
        switch(ch){
            case 1:
                s.withdraw();
                break;
            case 2:
                s.Deposite();
                break;
            case 3:
                s.check_Bal();
                break;
            default:
                System.out.println("invalid choice");


        }

    }
}
