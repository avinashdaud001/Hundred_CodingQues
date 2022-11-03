public class Factorial {

    public static int fact(int n) {
 if(n<=1){
     return 1;
 }
    int small = fact(n - 1);
    int big = small * n;

    return big;
}


    public static void main(String[] args) {
        System.out.println(Factorial.fact(5));
    }
}
