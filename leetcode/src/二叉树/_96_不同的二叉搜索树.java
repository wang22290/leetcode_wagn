package 二叉树;

/**
 * 96. 不同的二叉搜索树
 * https://leetcode-cn.com/problems/unique-binary-search-trees/
 * created by wagn on 2020/7/15
 */
public class _96_不同的二叉搜索树 {

    public static void main(String[] args) {
        System.out.println(numTrees(5));
    }

    public static int numTrees(int n) {
         int[] dp = new  int[n+1];
         dp[0] = 1;
         dp[1] = 1;

        for (int i = 2; i < n + 1; i++) {
            for (int j = 1; j < i+1; j++) {
                dp[i] += dp[j - 1] * dp[i - j];
            }
        }
        return dp[n];
    }
}
