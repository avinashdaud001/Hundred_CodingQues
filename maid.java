import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

// Class name should be "Source",
// otherwise solution won't be accepted
public class maid {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String str=in.nextLine();
        str=str.toLowerCase();
        String words[]=str.split("\\s+");
        int wordslen=words.length;
        for(int i=0;i<wordslen;i++){
            int count=1;
            for(int j=i+1;j<wordslen;j++){
//                if(words[i].equals(words[j])){
                    if(words[i]==words[j]){
                        count++;
//                    }

                }



            }
            System.out.println(words[i]+"->"+count+"times ");
        }

        // // Declare the variable
        // int a;

        // // Read the variable from STDIN
        // a = in.nextInt();

        // // Output the variable to STDOUT
        // System.out.println(a);
    }
}
