package 二叉树;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * 589. N叉树的前序遍历
 * https://leetcode-cn.com/problems/n-ary-tree-preorder-traversal/
 * created by wagn on 2020/5/21
 */
public class _589_N叉树的前序遍历 {


    public static void main(String[] args) {

    }


//    public List<Integer> preorder(Node root) {
//        List<Integer> list = new LinkedList<>();
//        if (root == null) return list;
//        traval(root,list);
//        return list;
//    }
//
//    private void  traval(Node node,List<Integer> list){
//        if (node == null) return;
//        list.add(node.val);
//        for (Node node1 :node.children){
//            traval(node1,list);
//        }
//
//    }

    public List<Integer> preorder(Node root) {
        List<Integer> list = new LinkedList<>();
        if (root == null) return list;
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()){
            Node cur = stack.pop();
            list.add(cur.val);
            Collections.reverse(cur.children);
            for (Node item :cur.children) {
                stack.push(item);
            }

        }
        return list;
    }

}
