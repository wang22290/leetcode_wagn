package 数组;

/**
 * 1295. 统计位数为偶数的数字
 * https://leetcode-cn.com/problems/find-numbers-with-even-number-of-digits/
 * created by wagn on 2020/4/22
 */
public class _1295_统计位数为偶数的数字 {

    public static void main(String[] args) {
    }

    static int findNumbers(int[] nums) {
            int counter = 0;
            for(int i = 0; i < nums.length;i++) {
                if(numbits(nums[i],0) % 2 == 0) {
                    counter++;
                }
            }
            return counter;
    }

    static int numbits(int number,int counter){
        if(number % 10 == number) {
            counter++;
            return counter;
        }
        counter++;
        return numbits(number / 10,counter);
    }
}
