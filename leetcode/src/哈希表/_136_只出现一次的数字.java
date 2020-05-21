package 哈希表;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 136. 只出现一次的数字
 * https://leetcode-cn.com/problems/single-number/
 * created by wagn on 2020/5/14
 */
public class _136_只出现一次的数字 {

    public static void main(String[] args) {
        int[] nums = {17,12,5,-6,12,4,17,-5,2,-3,2,4,5,16,-3,-4,15,15,-4,-5,-6};
        singleNumber(nums);
        System.out.println(singleNumber(nums));
    }
    public static int singleNumber(int[] nums) {

        int single = 0;
        for (int num : nums){
            single ^= num;
            System.out.println(single +"_"+ num);
        }
        return single;
    }


//    public static int singleNumber(int[] nums) {
//            Map<Integer, Integer> map = new HashMap<>();
//            for (Integer i : nums) {
//                Integer count = map.get(i);
//                count = count == null ? 1 : ++count;
//                map.put(i, count);
//            }
//            for (Integer i : map.keySet()) {
//                Integer count = map.get(i);
//                if (count == 1) {
//                    return i;
//                }
//            }
//            return -1;
//    }
}
