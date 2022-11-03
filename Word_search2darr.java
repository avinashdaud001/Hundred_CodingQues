import java.util.Objects;
import java.util.Scanner;

public class Word_search2darr {

      public boolean exist(char[][] board, String word) {

         char[] v = new char[word.length()];
         for (int k = 0; k < word.length(); k++) {
            v[k] = word.charAt(k);

            for (int i = 0; i < board.length; i++) {
               for (int j = 0; j < board.length; j++) {
                  if ( v[k]==board[i][j]||word.charAt(0)==board[i][j]) {
                     return true;
                  }
                  else{
                     return false;
                  }


               }
            }

         }
         return false;
      }

   public static void main(String[] args) {
         Scanner avi=new Scanner(System.in);
      System.out.println(" //  word =ABCCED =>[A,B,C,E],[S,F,C,S].[A,D,E,E]=>TRUE; \n// Word=AQWE=>[S,D,F,G],[H,J,K,L],[M,N,B,V]=>FALSE;");
      System.out.println("enter info which given above");
      String word=avi.nextLine();
      char [][] ar= new char[3][4];
      for(int i=0;i<ar.length;i++){
         for(int j=0;j<ar.length;j++){
            ar[i][j]=avi.next().charAt(0);

         }
         Word_search2darr d=new Word_search2darr();
        System.out.println( d.exist(ar,word) );

      }
   }




}


