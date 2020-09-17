package 动态规划;

import java.util.Arrays;

/**
 * 213. 打家劫舍 II
 * https://leetcode-cn.com/problems/house-robber-ii/
 * created by wagn on 2020/8/5
 */
public class _213_打家劫舍II {

    public static void main(String[] args) {

    }

    public static int rob(int[] nums) {


        if (nums == null || nums.length == 0 )return 0;
        if (nums.length == 1) return nums[0];

        return Math.max(myRob(Arrays.copyOfRange(nums,0,nums.length-1)),myRob(Arrays.copyOfRange(nums,1,nums.length)));
    }

    private static int myRob(int[] nums){
        int pre = 0,cur = 0,tep;
        for (int num:nums){
            tep = cur;
            cur = Math.max(pre + num,cur);
            pre = tep;
        }
        return cur;
    }
}
