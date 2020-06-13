package 数组;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * 1431. 拥有最多糖果的孩子
 * https://leetcode-cn.com/problems/kids-with-the-greatest-number-of-candies/
 * created by wagn on 2020/6/13
 */
public class _1431_拥有最多糖果的孩子 {

    public static void main(String[] args) {
        int[] candies = {2,3,5,1,3};
        System.out.println(kidsWithCandies(candies,3));
    }


//    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
//        int max = Integer.MIN_VALUE;
//        for (int num : candies) {
//            max = Math.max(max, num);
//        }
//        List<Boolean> res = new ArrayList<>(candies.length);
//        for (int num : candies) {
//            res.add(num + extraCandies >= max ? Boolean.TRUE : Boolean.FALSE);
//        }
//        return res;
//    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list = new LinkedList<>();
        Integer maxNumber = Arrays.stream(candies).max().getAsInt();

        for (int num:candies) {
            if (candies[i] + extraCandies >= maxNumber){
                list.add(true);
            }else {
                list.add(false);
            }
        }

        return list;
    }


}
