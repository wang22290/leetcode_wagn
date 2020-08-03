package 数组;

import java.util.Arrays;

/**
 * 删除排序数组中的重复项
 * created by wagn on 2020/7/30
 */
public class 删除排序数组中的重复项 {

    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};

        removeDuplicates(nums);
//        System.out.println(removeDuplicates(nums));
    }
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]){
                i++;
                nums[i] = nums[j];
            }
        }
        System.out.println(i+1);
        return i+1;
    }
}
