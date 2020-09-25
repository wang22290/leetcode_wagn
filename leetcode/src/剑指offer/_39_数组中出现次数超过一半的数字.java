package 剑指offer;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * created by wagn on 2020/9/23
 */
public class _39_数组中出现次数超过一半的数字 {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 2, 2, 2, 5, 4, 2};

        System.out.println(  majorityElement(arr));
     majorityElement1(arr);
    }


    public static int majorityElement1(int[] nums) {
        int count = 1;
        int majority = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (majority == nums[i]) {
                count++;
            } else {
                count--;
                if (count == 0) {
                    majority = nums[i];
                    count = 1;
                }
            }
        }
        return majority;
    }


    public static int majorityElement(int[] nums) {

        int number = nums.length / 2;
        Map<Integer,Integer> map = new HashMap<>();
        int lagerNumber = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])){
                count = map.get(nums[i]) + 1;
            }else {
                count = 1;
            }
            map.put(nums[i],count);
        }
        for (int i = 0; i < nums.length; i++) {
            if (map.get(nums[i]) >  nums.length / 2){
                lagerNumber = nums[i];
            }
        }
        return lagerNumber;
    }
}
