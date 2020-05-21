package 二叉树;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 102. 二叉树的层序遍历
 * https://leetcode-cn.com/problems/binary-tree-level-order-traversal/
 * created by wagn on 2020/5/13
 */
public class _102_二叉树的层序遍历 {


    private List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) return res;
        getList(root, 0);
        return res;
    }

    private void getList(TreeNode node, int i) {
        if (node == null) return;

        if (res.size() == i) res.add(new ArrayList<>());

        res.get(i).add(node.val);

        getList(node.left, i+1);
        getList(node.right, i+1);
    }



//    public List<List<Integer>> levelOrder(TreeNode root) {
//        if (root == null)return new ArrayList<List<Integer>>();
//        List<List<Integer>> res = new ArrayList<List<Integer>>();
//
//        Queue<TreeNode> queue = new LinkedList<>();
//        queue.add(root);
//        while (!queue.isEmpty()){
//            int size = queue.size();
//            ArrayList<Integer> tem = new ArrayList<>();
//            for (int i = 0; i < size; i++) {
//                TreeNode treeNode = queue.remove();
//                tem.add(treeNode.val);
//                if (treeNode.left != null){
//                    queue.add(treeNode.left);
//                }
//                if (treeNode.right != null){
//                    queue.add(treeNode.right);
//                }
//            }
//            res.add(tem);
//        }
//        return res;
//    }

}
