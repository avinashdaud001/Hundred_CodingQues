import java.util.Scanner;

public class Missing_Alphabate {


        public static int Alpha_len = 26;
//
        public static void main(String[] args) {
            Scanner avi = new Scanner(System.in);
            System.out.println("enter alphabate");
            String p = avi.nextLine();
            if (validation(p)) {
                System.out.println("whole Alphabate are correct");
            } else {
                System.out.println("Some alphabate are missing or extra added");
            }
        }

        public static boolean validation(String Alphabate) {
            if (Alphabate.length() < Alpha_len&&Alphabate.length() > Alpha_len) {

                return false;
            }


            int charcount = 0;
//            int numcount = 0;
            for (int i = 0; i < Alphabate.length(); i++) {
                char ch = Alphabate.charAt(i);




                 if (is_letter(ch)) {
                    charcount++;
                } else {
                    return false;
                }
            }

            return (charcount >= 26);
     }


        public static boolean is_letter(char ch){
            ch=Character.toUpperCase(ch);
            return(ch>='A'&&ch<='Z');

        }
//        public static boolean is_num(char ch){
//
//            return(ch>='0'&&ch<='9');
//        }
    }


