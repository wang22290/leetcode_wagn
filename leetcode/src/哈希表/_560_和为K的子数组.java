package 哈希表;

/**
 * 560. 和为K的子数组
 * https://leetcode-cn.com/problems/subarray-sum-equals-k/
 * created by wagn on 2020/5/15
 */
public class _560_和为K的子数组 {

    public static void main(String[] args) {

    }

    public static int subarraySum(int[] nums, int k) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int end = i; end >= 0 ; --end) {
                sum += nums[end];
                if (sum == k){
                    count++;
                }
            }
        }
        return count;
    }
}
