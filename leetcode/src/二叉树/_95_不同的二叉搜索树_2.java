package 二叉树;

import java.util.ArrayList;
import java.util.List;

/**
 * created by wagn on 2020/7/21
 */
public class _95_不同的二叉搜索树_2 {

    public static void main(String[] args) {

    }

    public List<TreeNode> generateTrees(int n) {
        List<TreeNode> list = new ArrayList<TreeNode>();
        if (n == 0){
            return list;
        }
        list.add(null);

        for (int i = 1; i <= n; i++) {
            List<TreeNode> cur = new ArrayList<TreeNode>();
            for (TreeNode root :list){
                TreeNode insert = new TreeNode(i);
                insert.left = root;
                cur.add(insert);
                for (int j = 0; j <= n; j++) {
                    TreeNode root_copy = treeCopy(root);
                    TreeNode right = root_copy;
                    int k = 0;
                    for (; k < j; k++) {
                        if (right == null){
                            break;
                        }
                        right = right.right;
                    }
                    if (right == null)
                        break;
                    TreeNode rightTree = right.right;
                    insert = new TreeNode(i);
                    right.right = insert;
                    insert.left =  rightTree;
                    cur.add(root_copy);
                }
            }
            list = cur;
        }
        return list;
    }

    private TreeNode treeCopy(TreeNode root){
        if (root == null)return root;
        TreeNode newRoot = new TreeNode(root.val);
        newRoot.left = treeCopy(root.left);
        newRoot.right = treeCopy(root.right);
        return newRoot;
    }


}
