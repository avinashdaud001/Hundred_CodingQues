public class String_null_or_empty {
    public static void main(String[] args) {
        String n="hello";
        String n2="";
        String n3=null;
        boolean b;
        b=(n==null||n.length()==0);
        System.out.println("String is null  "   +  b);


        b=(n2==null||n2.length()==0);
        System.out.println("String is null or empty    "   +  b);
        b=(n3==null||n3.length()==0);
        System.out.println("String is null or empty   "   +  b);

    }
}
