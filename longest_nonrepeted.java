import java.util.HashSet;
import java.util.Set;

public class longest_nonrepeted {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int right = 0;
        int length = s.length();
        int max_length = 0;
        Set<Character> check = new HashSet<>();

        while(right < length){
            if(check.contains( s.charAt(right)) == true){

                while((left < right) && check.contains(s.charAt(right)) == true){
                    check.remove(s.charAt(left));
                    left++;
                }
            }

            check.add(s.charAt(right));
            max_length = Math.max(max_length, right-left+1);
            right++;

        }

        return max_length;
    }

    public static void main(String[] args) {
        String d="abcabcbb";
        longest_nonrepeted q=new longest_nonrepeted();

        System.out.println( q.lengthOfLongestSubstring(d));

    }
}

