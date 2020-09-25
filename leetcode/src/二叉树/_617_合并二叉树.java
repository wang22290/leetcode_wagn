package 二叉树;

import java.util.LinkedList;
import java.util.List;

/**
 * 617. 合并二叉树
 *https://leetcode-cn.com/problems/merge-two-binary-trees/
 * created by wagn on 2020/9/23
 */
public class _617_合并二叉树 {
    public static void main(String[] args) {

    }
    public static TreeNode mergeTrees(TreeNode t1, TreeNode t2) {

        if (t1 == null){
            return t2;
        }
        if (t2 == null){
            return t1;
        }

        TreeNode merged = new TreeNode(t1.val + t2.val);
        merged.left = mergeTrees(t1.left,t2.left);
        merged.right = mergeTrees(t1.right,t2.right);
        return merged;
    }

//    public static List preorderTraee(TreeNode t){
//        LinkedList<TreeNode> list = new LinkedList<>();
//        LinkedList<Integer> output = new LinkedList<>();
//        list.add(t);
//        while (!list.isEmpty()){
//           TreeNode  lastNode = list.pollLast();
//           output.add(lastNode.val);
//           if (lastNode.right != null){
//               list.add(lastNode.right);
//           }
//           if (lastNode.left != null){
//               list.add(lastNode.left);
//           }
//
//        }
//        return output;
//    }

}
