package 数组;

import java.util.HashMap;
import java.util.Map;

/**
 * created by wagn on 2020/7/20
 */
public class _1_两数之和 {
    public static void main(String[] args) {
//        System.out.println();
        int[] nums =
        twoSum(new int[]{2, 7, 11, 15},9);
        twoSum1(new int[]{2, 7, 11, 15},9);
    }

    public static int[] twoSum(int[] nums, int target) {
       Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i],i);
        }
        for (int i = 0; i < nums.length; i++) {
            int compNumber = target - nums[i];
            if (map.containsKey(compNumber) && map.get(compNumber) != i){
                return new int[]{i,map.get(compNumber)};
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }


    public static int[] twoSum1(int[] nums, int target) {
        int v = 2 << 10;
        int bit = v - 1;
        int[] ints = new int[v];
        for (int i = 0; i < nums.length; i++) {
            int index = (target - nums[i]) & bit;
            if (ints[index] != 0) {
                return new int[]{ints[index] - 1, i};
            }
            ints[nums[i] & bit] = i + 1;
        }
        throw new IllegalArgumentException("no such num sum equals target");
    }

    public int[] twoSum3(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int complement = target - nums[i];
            if(map.containsKey(complement)){
                return new int[] {map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }

}
