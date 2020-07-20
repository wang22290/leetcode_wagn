package 数组;

import java.util.HashMap;
import java.util.Map;

/**
 * created by wagn on 2020/7/20
 */
public class _167_两数之和II输入有序数组 {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            map.put(numbers[i],i+ 1);
        }
        for (int i = 0; i < numbers.length; i++) {
            int compNumber = target - numbers[i];
            if (map.containsKey(compNumber) && map.get(compNumber) > i  ){
                return new int[]{i,map.get(compNumber) +1};
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
