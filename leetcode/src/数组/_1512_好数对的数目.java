package 数组;

/**
 * 1512. 好数对的数目
 * https://leetcode-cn.com/problems/number-of-good-pairs/
 * created by wagn on 2020/7/14
 */
public class _1512_好数对的数目 {
    public int numIdenticalPairs(int[] nums) {
        int goodNumber = 0;
        for (int i = 0; i < nums.length; i++) {
            int left = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]){
                    goodNumber++;
                }
            }
        }
        return goodNumber;

    }

}
