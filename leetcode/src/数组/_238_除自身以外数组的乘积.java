package 数组;

import java.util.LinkedList;
import java.util.List;

/**
 * 238. 除自身以外数组的乘积
 * https://leetcode-cn.com/problems/product-of-array-except-self/
 * created by wagn on 2020/6/4
 */
public class _238_除自身以外数组的乘积 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(productExceptSelf(nums));
    }
    public static int[] productExceptSelf(int[] nums) {
        int length = nums.length;

        int[] sums  = new int[length];
        int[] leftList  = new int[length];
        int[] rightList  = new int[length];
        leftList[0] = 1;
        for (int i = 1; i < length; i++) {
            leftList[i] = nums[i-1] * leftList[i-1];
        }
        rightList[length -1 ] = 1;
        for (int i = length -2; i >= 0; i--) {
            rightList[i] = nums[i + 1] * rightList[i + 1];
        }
        for (int i = 0; i <length; i++) {
            sums[i] = leftList[i] * rightList[i];
        }
        return sums;
    }


    public int[] productExceptSelf111(int[] nums) {

        if (nums==null || nums.length==0){
            return nums;
        }
        int[] f = new int[nums.length];
        f[0]=1;
        for (int i=1;i<nums.length;i++){
            f[i] =f[i-1]*nums[i-1];
        }
        int tmp = 1;
        for (int i=nums.length-1;i>=0;i--){
            f[i] *=tmp;
            tmp *=nums[i];
        }
        return f;
    }

}




