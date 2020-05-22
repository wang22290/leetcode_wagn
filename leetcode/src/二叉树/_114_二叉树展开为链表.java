package 二叉树;

/**
 * 114. 二叉树展开为链表
 * https://leetcode-cn.com/problems/flatten-binary-tree-to-linked-list/
 * created by wagn on 2020/5/22
 */
public class _114_二叉树展开为链表 {
    public void flatten(TreeNode root) {
        if (root == null)return;
        TreeNode current = root;
        while (current.left != null ){
            TreeNode temp = current.right;
            current.right = current.left;
            flatten(current);
            current.right = temp;
        }
    }
    private void travel(TreeNode node){
        if (node == null)return;

    }
}
