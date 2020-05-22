package 二叉树;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * 590. N叉树的后序遍历
 * https://leetcode-cn.com/problems/n-ary-tree-postorder-traversal/
 * created by wagn on 2020/5/22
 */
public class _590_N叉树的后序遍历 {
    public static void main(String[] args) {
        System.out.println("1111");
    }

    public List<Integer> postorder(Node root) {
        LinkedList<Integer> list = new LinkedList<>();
        if (root == null) return list;
        LinkedList<Node> stack = new LinkedList<>();
        stack.add(root);
        while (!stack.isEmpty()){
            Node currentNode = stack.pollLast();
            list.addFirst(currentNode.val);
            for (Node node:currentNode.children) {
                stack.add(node);
            }
        }
        return list;

    }
}
