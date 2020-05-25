package 二叉树;

import javax.xml.soap.Node;

/**
 * \105. 从前序与中序遍历序列构造二叉树
 * https://leetcode-cn.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/
 * created by wagn on 2020/5/22
 */
public class _105_从前序与中序遍历序列构造二叉树 {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder == null || inorder == null) return new TreeNode();
        TreeNode root = new TreeNode(preorder[0]);


        return root;
    }
}
