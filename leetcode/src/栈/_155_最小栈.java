package 栈;

import java.util.LinkedList;
import java.util.Stack;

/**
 * 155. 最小栈
 * https://leetcode-cn.com/problems/min-stack/
 * created by wagn on 2020/4/27
 */
public class _155_最小栈 {


    Stack<Integer> stack1;
    Stack<Integer> minStack;
    /** initialize your data structure here. */
    public  _155_最小栈() {
        stack1 = new Stack();
        minStack = new Stack();
    }

    public void push(int x) {
        if (!minStack.isEmpty()) {
            int top = minStack.peek();
            //小于的时候才入栈
            if (x <= top) {
                minStack.push(x);
            }
        }else{
            minStack.push(x);
        }

        stack1.push(x);
    }

    public  void pop() {
          int tem = stack1.pop();
          if (tem == minStack.lastElement()){
              minStack.pop();
          }
    }

    public  int top() {
        return stack1.lastElement();
    }

    public  int getMin() {
        return minStack.lastElement();
    }

}
