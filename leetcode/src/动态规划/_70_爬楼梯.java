package 动态规划;

/**
 * 70. 爬楼梯
 * https://leetcode-cn.com/problems/climbing-stairs/
 * created by wagn on 2020/6/13
 */
public class _70_爬楼梯 {
    public static void main(String[] args) {
        System.out.println(climbStairs(10));

    }
    public static int climbStairs(int n) {
        int[] dp = new int[n+2];
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <=n ; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }

}
