package 剑指offer;

import java.util.Arrays;

/**
 * 剑指 Offer 03. 数组中重复的数字
 * https://leetcode-cn.com/problems/shu-zu-zhong-zhong-fu-de-shu-zi-lcof/
 * created by wagn on 2020/9/24
 */
public class _03_数组中重复的数字 {

    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 0, 2, 5, 3};
        findRepeatNumber(nums);
    }
    public static int findRepeatNumber(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            while (i != nums[i]){
                if (nums[i] == nums[nums[i]]){
                    return nums[i];
                }else {
                    int tep = nums[i];
                    nums[i] = nums[tep];
                    nums[tep] = tep;
                }
            }
        }
        return -1;
    }
    public static int findRepeatNumber2(int[] nums) {
        int repreat = 0;
        Arrays.sort(nums);
        repreat = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (repreat == nums[i]) {
                return repreat;
            } else {
                repreat = nums[i];
            }
        }
        return repreat;
    }
}
