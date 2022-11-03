import java.util.*;

public class Letter_comb_of_number {

        public List<String> letterCombinations(String digits) {
            List<String> result = new ArrayList<>();
            if (digits.length() == 0) return result;

            String[] str = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
            Deque<String> q = new ArrayDeque<>();
            q.add("");

            for (int i = 0; i < digits.length(); i++) {
                String d = digits.substring(i, i + 1);
                String fromStr = str[Integer.parseInt(d)];
                int qSize = q.size();

                for (int j = 0; j < qSize; j++) {
                    String pull = q.pollFirst();

                    for (int k = 0; k < fromStr.length(); k++) {
                        String temp = pull.concat(fromStr.charAt(k) + "");
                        q.add(temp);
                    }
                }
            }

            while (!q.isEmpty()) result.add(q.poll());

            return result;
        }

    public static void main(String[] args) {
       Scanner avi=new Scanner(System.in);
        System.out.println("enter any number ");
        String s=avi.nextLine();
        Letter_comb_of_number h=new Letter_comb_of_number();
       System.out.println(h.letterCombinations(s));
    }
    }




