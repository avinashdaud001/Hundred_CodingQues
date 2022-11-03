public class Roman_intger {
    int value(char r[]) {
        int total = 0;

        for (int i = 0; i < r.length; i++) {

            if (r[i] == 'V') {
                return 5;
            }  if (r[i] == 'X') {
                return 10;
            }  if (r[i] == 'M') {
                return 1000;
            }  if (r[i] == 'L') {
                return 50;
            }  if (r[i] == 'I') {
                return 1;
            }
            if(r[i]=='C'){
                return 100;
            }
            if(r[i]=='D'){
                return 500;
            }




        }
        return -1;
    }


    public int romanToInt(String s) {
        int res = 0;

//        char[] b =new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            int s1 = value(new char[]{s.charAt(i)});
            if (i + 1 < s.length()) {
                int s2 = value(new char[]{s.charAt(i + 1)});
                if (s1 >= s2) {
                    res = res + s1;
                } else {
                    res = res + s2 - s1;
                    i++;
                }
            } else {
                res = res + s1;
            }


//          return new char[]{b[i] = s.charAt(i)};
        }
        return res;


    }

    public static void main(String[] args) {
        String b="MX";
        Roman_intger avi=new Roman_intger();
        System.out.println(avi.romanToInt(b));
    }

}

