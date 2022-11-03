import java.util.ArrayList;

public class minStack {

        ArrayList<int[]> minStack;

        public minStack() {
            minStack=new ArrayList<>();
        }

        public void push(int val) {
            if(minStack.size()==0){
                minStack.add(new int[]{val,val});
            }else{
                int m= minStack.get(minStack.size()-1)[1];
                minStack.add(new int[]{val,m<val?m:val});
            }
        }

        public void pop() {
            minStack.remove(minStack.size()-1);
        }

        public int top() {
            return minStack.get(minStack.size()-1)[0];
        }

        public int getMin() {
            return minStack.get(minStack.size()-1)[1];
        }
    }

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */

