package 剑指offer;

/**
 * https://leetcode-cn.com/problems/diao-zheng-shu-zu-shun-xu-shi-qi-shu-wei-yu-ou-shu-qian-mian-lcof/
 * created by wagn on 2020/9/24
 */
public class _21_调整数组顺序使奇数位于偶数前面 {


    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 2, 2, 5, 4, 2};
        System.out.println(exchange(arr));
    }
    public static int[] exchange(int[] nums) {
        int[] newNums = new int[nums.length];
        int i = 0;
        int j = nums.length - 1;
        for (int i1 = 0; i1 < nums.length; i1++) {
            if (nums[i1] % 2 == 0){
                newNums[j] = nums[i1];
                j--;
            }else {
                newNums[i] = nums[i1];
                i++;
            }
        }
        return newNums;

    }
}
