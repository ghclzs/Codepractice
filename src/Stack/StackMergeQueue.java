package Stack;

import java.util.Stack;

public class StackMergeQueue<T> {

    //用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);
    }


    public int pop() {
        while (stack2.isEmpty()){
            while (!stack1.isEmpty()){
                stack2.push(stack1.peek());
                stack1.pop();
            }
        }
        int val = stack2.peek();
        stack2.pop();
        while (!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }
        return val;
    }

    public static void main(String[] args) {
//        StackMergeQueue<Integer> stackmergequeue = new Stack.StackMergeQueue<Integer>();
        StackMergeQueue<Integer> stackmergequeue = new StackMergeQueue<Integer>();
        stackmergequeue.push(2);
        stackmergequeue.push(3);
        System.out.println(stackmergequeue.pop());
        System.out.println(stackmergequeue.pop());
        System.out.println(stackmergequeue);
    }
}

