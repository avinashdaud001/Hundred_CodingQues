import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'alternate' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */

    public static int alternate(String s) {
        // Write your code here


        String res = "";
        for (int i = 0; i < 26; i++) {
            for (int j = i + 1; j < 26; j++) {
                char a = (char) ('a' + i);
                char b = (char) ('a' + j);
                String cur = "";
                for (int k = 0; k <s.length(); k++) {
                    if (s.charAt(k) == a || s.charAt(k) == b) {
                        cur += s.charAt(k);
                    }
                }
                if (cur.length() < res.length()) continue;
                if (isGood(cur)) res = cur;
            }
        }
//        System.out.println(res.length());


        return res.length();

    }


    public static boolean isGood(String s){
        if (s.length()==1) return false;
        for(int i=1;i<s.length();i++){
            if (s.charAt(i)==s.charAt(i-1)) return false;
        }
        return true;
    }
}
class solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int l = Integer.parseInt(bufferedReader.readLine().trim());

        String s = bufferedReader.readLine();

        int result = Result.alternate(s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
