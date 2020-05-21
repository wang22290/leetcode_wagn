package 二叉树;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * 94. 二叉树的中序遍历
 * https://leetcode-cn.com/problems/binary-tree-inorder-traversal/
 * created by wagn on 2020/5/20
 */
public class _94_二叉树的中序遍历 {

//    public List<Integer> inorderTraversal(TreeNode root) {
//        List<Integer> list = new LinkedList<>();
//        traversal(root,list);
//        return list;
//
//    }
//
//    private void traversal(TreeNode node,List<Integer> list){
//        if (node == null) return ;
//        traversal(node.left,list);
//        list.add(node.val);
//        traversal(node.right,list);
//    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new LinkedList<>();
        if (root == null) return list;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode currentNode = root;
        while (currentNode != null || !stack.isEmpty()){
            while (currentNode != null){
                stack.push(currentNode);
                currentNode = currentNode.left;
            }
            currentNode = stack.pop();
            list.add(currentNode.val);
            currentNode = currentNode.right;
        }
        return list;
    }

}
