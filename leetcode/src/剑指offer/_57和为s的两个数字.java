package 剑指offer;

import sun.plugin.javascript.navig.Link;

import java.util.LinkedList;
import java.util.List;

/**
 * 剑指 Offer 57. 和为s的两个数字
 * https://leetcode-cn.com/problems/he-wei-sde-liang-ge-shu-zi-lcof/
 * created by wagn on 2020/9/24
 */
public class _57和为s的两个数字 {

    public static void main(String[] args) {

    }

    public static int[] twoSum(int[] nums, int target) {
        int i = 0;
        int j = nums.length - 1;
        while (i < j) {
            int s = nums[i] + nums[j];
            if (s < target) {
                i++;
            } else if (s > target) {
                j--;
            } else if (s == target) {
                int[] sums = {nums[i], nums[j]};
                return sums;
            }
        }
        return null;
    }

}
