package 二叉树;

import java.util.*;

/**
 * 145. 二叉树的后序遍历
 * https://leetcode-cn.com/problems/binary-tree-postorder-traversal/
 * created by wagn on 2020/5/21
 */
public class _145_二叉树的后序遍历 {
    /*递归方法*/
//    public List<Integer> postorderTraversal(TreeNode root) {
//        List<Integer> list = new LinkedList<>();
//        if (root == null) return list;
//        traversal(root,list);
//        return list;
//    }
//
//    private void traversal(TreeNode node,List<Integer> list){
//        if (node == null) return;
//
//        traversal(node.left,list);
//        traversal(node.right,list);
//        list.add(node.val);
//    }

    /*迭代方法
    * 而对于后序遍历，当我们到达 1 的时候并不能立刻把 1 弹出，因为遍历完右子树，我们还需要将这个根节点加入到 list 中。
    * 所以我们就需要判断是从左子树到的根节点，还是右子树到的根节点。如果是从左子树到的根节点，此时应该转到右子树。
    * 如果是从右子树到的根节点，那么就可以把当前节点弹出，并且加入到 list 中。当然，
    * 如果是从左子树到的根节点，此时如果根节点的右子树为 null， 此时也可以把当前节点弹出，并且加入到 list 中。
    * 通过记录上一次遍历的节点。如果当前节点的右节点和上一次遍历的节点相同，那就表明当前是从右节点过来的了。
    * */

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new LinkedList<>();
        if (root == null) return list;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode currentNode = root;
        TreeNode lastNode = null;
        while (currentNode != null || !stack.isEmpty()){
           if (currentNode != null){
               stack.push(currentNode);
               currentNode = currentNode.left;
           }else {
               TreeNode temp = stack.peek();
               if (temp.right != null && temp.right != lastNode){
                   currentNode = temp.right;
               }else {
                   list.add(temp.val);
                   lastNode = temp;
                   stack.pop();
               }
           }
        }
        return list;

    }
}
