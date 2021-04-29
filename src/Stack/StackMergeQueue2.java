package Stack;

import java.util.Stack;

public class StackMergeQueue2 {
    Stack<Integer> stack1 = new Stack();
    Stack<Integer> stack2 = new Stack();
    public void add(int val){
        stack1.push(val);
    }
    public int pop(){
        while (!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        int res = stack2.pop();
        return res;
    }
}
