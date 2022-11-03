public class first_occurnc_String {

        public static int strStr(String haystack, String needle) {
            int index=haystack.indexOf(needle);
            if(index>=0){
                return index;
            }
            else{
                return -1;
            }
        }

    public static void main(String[] args) {
        String a="sadbutsad";
       String b= "sad";
       strStr(a,b);

    }
    }

