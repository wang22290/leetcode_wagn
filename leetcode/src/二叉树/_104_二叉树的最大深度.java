package 二叉树;

import java.util.LinkedList;
import java.util.Queue;

/**
 * created by wagn on 2020/5/21
 */
public class _104_二叉树的最大深度 {
    public int maxDepth(TreeNode root) {
        if (root == null)return 0;
        int height = 0;
//        int levelSize = 1;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            int levelSize = queue.size();
            TreeNode node = queue.poll();
            levelSize --;
            if (node.left != null){
                queue.offer(node.left);
            }
            if (node.right != null){
                queue.offer(node.right);
            }
            if (levelSize == 0){
                levelSize = queue.size();
                height ++;
            }
        }
        return height;
//        return height(root);
    }
//    private int height (TreeNode node){
//        if (node == null) return 0;
//        return 1+ Math.max(height(node.left),height(node.right));
//    }
}
