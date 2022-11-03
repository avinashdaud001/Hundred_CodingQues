
    import java.io.*;

    public class ReapetedString {



        public static long repeatedString(String s, long n) {
            // Write your code here
            long count=0;
            String v=s;
            s.repeat((int) n);
//            char[]f=new char[s.length()];
//            for(int i=0;i<s.length();i++){
//                f[i]=s.charAt(i);
//            }
            while(n>0){
                if(s.equals(v)){
                    count++;

                }
                n--;
            }
            return count;

        }




//    public class Solution {
        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

            String s = bufferedReader.readLine();

            long n = Long.parseLong(bufferedReader.readLine().trim());

            long result =  ReapetedString.repeatedString(s, n);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();

            bufferedReader.close();
            bufferedWriter.close();
        }
    }


