import java.util.Stack;

public   class validParentheses {

        public static boolean isValid(String s) {
            Stack<Character> stak = new Stack<>();
            int pushs = 0;
            int pops = 0;
            for(char ch: s.toCharArray()){
                if(ch == '(' || ch == '[' || ch == '{'){
                    stak.push(ch);
                    pushs++;
                }
                else{
                    if(stak.empty()) return false;
                    char c = stak.pop();
                    if(ch == ')')ch='(';
                    if(ch == ']')ch='[';
                    if(ch == '}')ch='{';
                    if(c != ch){
                        return false;
                    }
                    pops++;
                }
            }
            if(pushs == pops) return true;
            return false;
        }

    public static void main(String[] args) {
        String a="[]";
        String b="(}";
        isValid(a);
    }
    }




