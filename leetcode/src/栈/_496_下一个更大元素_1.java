package 栈;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;

/**
 * 496. 下一个更大元素 I
 * https://leetcode-cn.com/problems/next-greater-element-i/
 * created by wagn on 2020/4/24
 */
public class _496_下一个更大元素_1 {
//[1,3,5,2,4]
//        [6,5,4,3,2,1,7]
    public static void main(String[] args) {
        int[] num1= {1,3,5,2};
        int[] num2 = {2,3,5,1,0,7};
//        System.out.println(nextGreaterElement(num1,num2));

        System.out.println(nextGreaterElement1(num1,num2));

    }

    public static int[] nextGreaterElement1(int[] nums1, int[] nums2) {
        Stack< Integer > stack = new Stack < > ();
        HashMap< Integer, Integer > map = new HashMap < > ();
        int[] res = new int[nums1.length];
        for (int i = 0; i < nums2.length; i++) {
            while (!stack.empty() && nums2[i] > stack.peek())
                map.put(stack.pop(), nums2[i]);
            stack.push(nums2[i]);
        }
        while (!stack.empty())
            map.put(stack.pop(), -1);
        for (int i = 0; i < nums1.length; i++) {
            res[i] = map.get(nums1[i]);
            System.out.println(res[i] );
        }
        return res;
    }

}
