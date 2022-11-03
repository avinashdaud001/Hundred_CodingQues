public class Reforming_String {

        public String reformat(String s) {

            char n[]=new char[s.length()];
            for(int i=0;i<n.length;i++) {
                n[i] = s.charAt(i);
            }
                char f[]=new char[n.length];
                f[0]=n[1];
                f[1]=n[0];
                f[2]=n[3];
                f[3]=n[2];
                f[4]=n[5];
                f[5]=n[4];

            String b=String.valueOf(f);

            return b;
        }

    public static void main(String[] args) {
        String h="a0b1c2";
        Reforming_String l=new Reforming_String();
        System.out.println( l.reformat(h));

    }

}
