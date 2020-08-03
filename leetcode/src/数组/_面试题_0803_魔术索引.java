package 数组;

/**
 *面试题 08.03. 魔术索引
 * https://leetcode-cn.com/problems/magic-index-lcci/
 * created by wagn on 2020/7/31
 */
public class _面试题_0803_魔术索引 {

    public static void main(String[] args) {
int[] nums = {1, 1, 1};
        System.out.println(findMagicIndex(nums));

    }

    public static int findMagicIndex(int[] nums) {
        int maginIndex = -1;
        for (int i = 0; i < nums.length; i++) {
            if (i == nums[i]){
                maginIndex = i;
                break;
            }
        }
        return maginIndex;
    }

}
