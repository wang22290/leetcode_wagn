package 二叉树;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * https://leetcode-cn.com/problems/convert-bst-to-greater-tree/
 * created by wagn on 2020/9/21
 */
public class _538_把二叉搜索树转换为累加树 {
    public static void main(String[] args) {

    }
    int sum = 0;
    public TreeNode convertBST(TreeNode root) {
        if (root != null) {
            convertBST(root.right);
            sum += root.val;
            root.val = sum;
            convertBST(root.left);
        }
        return root;
    }
}
