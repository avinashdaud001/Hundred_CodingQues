abstract class String_lin {
   abstract void srint(int x);

}
public class xyz extends String_lin{
    public void srint(int x){

    }
    public static void main(String[]args){
        String s ="Avinssh";
        int v=0;
        for(int i=0;i<s.length();i++){
            v++;
        }
        System.out.println(v);
    }
}
