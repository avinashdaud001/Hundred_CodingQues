public class swaping {

    public static void main(String[] args) {
        int n=10;
        int a=0;
        int b=1;
        int c=0;
        int d=0;
        for(int i=1;i<=n;i++){
            d=a+b;
            a=b;
            b=d;
            System.out.println(a);
        }


        System.out.println(a+" "+b);
        c=a;
        a=b;
        b=a;
        System.out.println(a+" "+b);
    }
}
