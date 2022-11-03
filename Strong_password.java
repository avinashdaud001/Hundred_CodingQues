import java.util.Scanner;

public class Strong_password {



        public static int pass_len = 8;

        public static void main(String[] args) {
            Scanner avi = new Scanner(System.in);
            System.out.println("enter password");
            String p = avi.nextLine();
            if (validation(p)) {
                System.out.println("valid password");
            } else {
                System.out.println("not valid password");
            }
        }

        public static boolean validation(String password) {
            if (password.length() < pass_len) {
                return false;
            }


            int charcount = 0;
            int numcount = 0;
            for (int i = 0; i < password.length(); i++) {
                char ch = password.charAt(i);


                if (is_num(ch)) {
                    numcount++;
                } else if (is_letter(ch)) {
                    charcount++;
                } else {
                    return false;
                }
            }

            return (charcount >= 2 && numcount >= 2);
        }


        public static boolean is_letter(char ch){
            ch=Character.toUpperCase(ch);
            return(ch>='A'&&ch<='Z');

        }
        public static boolean is_num(char ch){

            return(ch>='0'&&ch<='9');
        }
    }


