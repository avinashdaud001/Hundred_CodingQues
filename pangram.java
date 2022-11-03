
    import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
    public class pangram {


        /*
         * Complete the 'pangrams' function below.
         *
         * The function is expected to return a STRING.
         * The function accepts STRING s as parameter.
         */

        public static String pangrams(String s) {
            // Write your code here
            {
                boolean[] mark = new boolean[26];
                int index=0;
                for(int i=0;i<s.length();i++)
                {
                    if ('a' <= s.charAt(i) && s.charAt(i) <= 'z')
                    {
                        index = s.charAt(i) - 'a';
                    }
                    mark[index]=true;
                }
                for(int i=0;i<=25;i++)
                {
                    if(mark[i]==false)
                    {
                        return "not pangram";
                    }
                    else{
                        return "pangram";
                    }
                }
                return null;
            }


        }

    }

    class Solution {
        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

            String s = bufferedReader.readLine();

            String result = pangram.pangrams(s);

            bufferedWriter.write(result);
            bufferedWriter.newLine();

            bufferedReader.close();
            bufferedWriter.close();
//            We promptly judged antique ivory buckles for the prize
        }
    }


