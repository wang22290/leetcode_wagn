package 动态规划;

/**
 * 198. 打家劫舍
 * https://leetcode-cn.com/problems/house-robber/
 * created by wagn on 2020/8/5
 */
public class _198_打家劫舍 {

    public static void main(String[] args) {

        int[] num = {2,7,9,3,1,10,4};
        System.out.println(rob(num));
    }

    public static int rob(int[] nums) {

        if (nums.length == 0 || nums == null) return 0;
        int[] dp = new int[nums.length];
        if (nums.length == 1){
            return nums[0];
        }
        dp[0] = nums[0];
        dp[1] = nums[1] > nums[0]? nums[1]:nums[0];
        for (int i = 2; i < nums.length; i++) {
           dp[i] = Math.max(dp[i-2] + nums[i],dp[i-1]);
        }

        return dp[nums.length -1];

    }
}
