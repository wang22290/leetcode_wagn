package 栈;

import java.util.Stack;

/**
 * 232. 用栈实现队列
 * https://leetcode-cn.com/problems/implement-queue-using-stacks/
 * created by wagn on 2020/4/24
 */
public class _232_用栈实现队列 {
    /**
     * Initialize your data structure here.
     */
    Stack<Integer> stack1;
    Stack<Integer> stack2;
}
//    public _232_用栈实现队列() {
//        stack1 = new Stack<>();
//        stack2 = new Stack<>();
//    }
//
//    /** Push element x to the back of queue. */
//    public void push(int x) {
//        stack1.push(x);
//    }
//
//    /** Removes the element from in front of queue and returns that element. */
//    public int pop() {
//        if(stack2.isEmpty())
//            while(!stack1.isEmpty())
//                stack2.push(stack1.pop());
//        return stack2.pop();
//
//    }
//
//    /** Get the front element. */
//    public int peek() {
//        if(stack2.isEmpty())
//            while(!stack1.isEmpty())
//                stack2.push(stack1.pop());
//        return stack2.peek();
//    }
//
//    public int deleteHead() {
//        if(stack2.isEmpty())
//            while(!stack1.isEmpty())
//                stack2.push(stack1.pop());
//        return stack2.peek();
//
//    }


