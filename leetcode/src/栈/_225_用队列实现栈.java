package 栈;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 225. 用队列实现栈
 * https://leetcode-cn.com/problems/implement-stack-using-queues/
 * created by wagn on 2020/4/24
 */
public class _225_用队列实现栈 {
    private LinkedList<Integer> q1 ; //主栈
    private  LinkedList<Integer> q2; //辅助栈
    /** Initialize your data structure here. */
    public  _225_用队列实现栈 () {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }

    /** Push element x onto stack. */
    public void push(int x) {
        q1.push(x);
        if (q2.size() > 0){
            q2.remove();
        }
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
            q1.pop();
            q2.push(q1.pop());
            return q1.pop();
    }

    /** Get the top element. */
    public int top() {
        return q1.getFirst();
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return q1.isEmpty();
    }
}
