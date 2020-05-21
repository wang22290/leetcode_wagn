package 二叉树;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 144. 二叉树的前序遍历
 * https://leetcode-cn.com/problems/binary-tree-preorder-traversal/
 * created by wagn on 2020/5/20
 */
public class _144_二叉树的前序遍历 {

    public static void main(String[] args) {

    }

/*
*方法1 递归
*/
//    public  List<Integer> preorderTraversal(TreeNode root) {
//        List<Integer> list = new LinkedList<>();
//        helper(root,list);
//        return list;
//    }
//    private void helper(TreeNode node,List<Integer>list){
//        if (node == null) return ;
//        list.add(node.val);
//        helper(node.left,list);
//        helper(node.right,list);
//    }

    /*方法二 迭代*/
    public static List<Integer> preorderTraversal(TreeNode root) {

        List<Integer> list = new LinkedList<>();
        LinkedList<TreeNode> output = new LinkedList<>();
        if (root == null) return list;
        output.add(root);
        while (!output.isEmpty()) {
            TreeNode node = output.pollLast();
            list.add(node.val);
            if (node.right != null) {
                output.offer(node.right);
            }
            if (node.left != null) {
                output.offer(node.left);
            }
        }
        return list;
    }


//    public List<Integer> preorderTraversal(TreeNode root) {
//        LinkedList<TreeNode> stack = new LinkedList<>();
//        LinkedList<Integer> output = new LinkedList<>();
//        if (root == null) {
//            return output;
//        }
//
//        stack.add(root);
//        while (!stack.isEmpty()) {
//            TreeNode node = stack.pollLast();
//            output.add(node.val);
//            if (node.right != null) {
//                stack.add(node.right);
//            }
//            if (node.left != null) {
//                stack.add(node.left);
//            }
//        }
//        return output;
//    }




}
