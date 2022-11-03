
import java.util.Scanner;

public class CodesCracker
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the String: ");
        String str = s.nextLine();

        str = str.toLowerCase();
        String words[] = str.split("\\s+");
        int wordsLen = words.length;

        System.out.println("\n----Occurrences of Each Word----");
        for(int i=0; i<wordsLen; i++)
        {
            int count = 1;
            for(int j=(i+1); j<(wordsLen-1); j++)
            {
                if(words[i].equals(words[j]))
                {
                    count++;
                    for(int k=j; k<(wordsLen-1); k++)
                        words[k] = words[k+1];
                    wordsLen--;
                    j--;
                }
            }
            if(count==1)
                System.out.println(words[i]+ " ->1 time.");
            else
                System.out.println(words[i]+ "->" +count+" times.");
            count = 0;
        }
    }
}
