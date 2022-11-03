import java.util.Stack;

public class validate_Stck_Sequence {

        public boolean validateStackSequences(int[] pushed, int[] popped) {
            int j=0;
            Stack<Integer> stack=new Stack<>();
            for(int i=0;i<pushed.length;i++){
                int a=pushed[i];

                stack.push(a);
                while(!stack.empty() && stack.peek()==popped[j]){
                    stack.pop();
                    j++;
                }

            }
            while(j<popped.length){
                if(stack.peek()==popped[j]){
                    stack.pop();
                    j++;
                }
                else{
                    return false;
                }
            }
            return true;

        }

}
