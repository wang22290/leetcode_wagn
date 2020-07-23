package 剑指offer;

/**
 * 剑指 Offer 11. 旋转数组的最小数字
 * https://leetcode-cn.com/problems/xuan-zhuan-shu-zu-de-zui-xiao-shu-zi-lcof/
 * created by wagn on 2020/7/22
 */
public class _剑指Offer11_旋转数组的最小数字 {
    public static void main(String[] args) {

    }
    public int minArray1(int[] numbers) {
        int min = numbers[0];
        int leftIndex = 0;
        int rightIndex = numbers.length -1;
        int currentIndex;
        while (leftIndex < rightIndex){
            currentIndex = leftIndex + (rightIndex - leftIndex)/2;

            if (min < numbers[currentIndex]){
             leftIndex = currentIndex;
            }else {
                min = numbers[currentIndex];
                rightIndex = currentIndex;
            }
        }

        return min;
    }


    public int minArray(int[] numbers) {
        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {

            if (min > numbers[i]){
                min = numbers[i];
            }
        }

        return min;
    }

}
