 public class Special_SubStr {
     public static void main(String[] args) {
         String s = "aba";
         int start= 0;
         int count=0;
 int end=1;
 while(start<4){
     if(end!=4) {
         System.out.print(s.substring(start, end)+" ");
         start++;
         end++;
         count++;
     }
     else{
         System.out.print(s.substring(0,3));
         count++;
         return;
     }



 }
         System.out.println(count);

     }
 }
