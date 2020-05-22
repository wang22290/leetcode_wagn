package 二叉树;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

/**
 * 662. 二叉树最大宽度
 * https://leetcode-cn.com/problems/maximum-width-of-binary-tree/
 * created by wagn on 2020/5/21
 */
public class _662_二叉树最大宽度 {
    int ans;
    Map<Integer,Integer> left;
    public int widthOfBinaryTree(TreeNode root) {
        ans = 0;
        left = new HashMap<>();
        dfs(root,0,0);
        return ans;
    }

    public void dfs (TreeNode root,int depth,int pos){
        if (root == null) return;
        left.computeIfAbsent(depth,x->pos);
        ans = Math.max(ans,pos - left.get(depth) +1);
        dfs(root.left,depth +1,2*pos);
        dfs(root.right,depth+1,2 * pos +1);
    }
}
