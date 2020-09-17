package 动态规划;


import 二叉树.TreeNode;

/**
 * 337. 打家劫舍 III
 * https://leetcode-cn.com/problems/house-robber-iii/
 * created by wagn on 2020/8/5
 */
public class _337_打家劫舍III {

    public static void main(String[] args) {

    }

    public static int rob(TreeNode root) {
        int[] result = robInterNal(root);
        return Math.max(result[0],result[1]);
    }

    public static int[] robInterNal(TreeNode root){
        if (root == null) return new int[2];
        int[] rsult = new int[2];
        int[] left = robInterNal(root.left);
        int[] right = robInterNal(root.right);
        rsult[0] = Math.max(left[0],left[1]) + Math.max(right[0],right[1]);
        rsult[1] = left[0] + right[0] + root.val;
        return  rsult;

    }
}


//    public int rob(TreeNode root) {
//        int[] result = robInternal(root);
//        return Math.max(result[0], result[1]);
//    }
//
//    public int[] robInternal(TreeNode root) {
//        if (root == null) return new int[2];
//        int[] result = new int[2];
//
//        int[] left = robInternal(root.left);
//        int[] right = robInternal(root.right);
//
//        result[0] = Math.max(left[0], left[1]) + Math.max(right[0], right[1]);
//        result[1] = left[0] + right[0] + root.val;
//
//        return result;
//    }
//
//作者：reals
//        链接：https://leetcode-cn.com/problems/house-robber-iii/solution/san-chong-fang-fa-jie-jue-shu-xing-dong-tai-gui-hu/
//        来源：力扣（LeetCode）
//        著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。