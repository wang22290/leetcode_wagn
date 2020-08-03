package 动态规划;

/**
 * 343. 整数拆分
 * https://leetcode-cn.com/problems/integer-break/
 * created by wagn on 2020/7/30
 */
public class _343_整数拆分 {
    public static void main(String[] args) {

    }
    public static int integerBreak(int n) {
        int[] dp = new int[n+ 1];
        for (int i = 0; i <= n; i++) {
            int curMax = 0;
            for (int j = 0; j < i; j++) {
                curMax = Math.max(curMax,Math.max(j *(i-j) ,j*dp[i-j]));
            }
            dp[i] = curMax;
        }
        return dp[n];
    }

}
