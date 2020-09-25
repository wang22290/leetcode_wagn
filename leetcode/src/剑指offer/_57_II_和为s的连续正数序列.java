package 剑指offer;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * created by wagn on 2020/9/22
 */
public class _57_II_和为s的连续正数序列 {

    public static void main(String[] args) {
        System.out.println(findContinuousSequence1(9));
    }

    public static int[][] findContinuousSequence1(int target) {
        int i = 1;
        int j = 1;
        int sum = 0;
        List<int[]> res = new  ArrayList<>();

        while (i <= target / 2){
            if (sum < target){
                sum += j;
                j++;
            }else if (sum > target){
                sum -= i;
                i++;
            }else{
                int[] arr = new int[j - i];
                for (int k = i; k < j; k++) {
                    arr[k - i] = k;
                }
                res.add(arr);
                sum -= i;
                i++;
            }
        }
        return res.toArray(new int[res.size()][]);
    }

    public static int[][] findContinuousSequence(int target) {
        List<int[]> result = new ArrayList<>();
        int i = 1;
        while (target > 0) {
            target -= i++;
            if (target > 0 && target % i == 0) {
                int[] array = new int[i];

                for (int k = target / i, j = 0; k < target / i + i; j++, k++) {
                    array[j] = k;
                }
                result.add(array);
            }
        }
        Collections.reverse(result);
        return result.toArray(new int[0][]);

    }

}
