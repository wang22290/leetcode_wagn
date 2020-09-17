package 数学;

/**
 *
 * 剑指 Offer 17. 打印从1到最大的n位数
 * https://leetcode-cn.com/problems/da-yin-cong-1dao-zui-da-de-nwei-shu-lcof/
 * created by wagn on 2020/9/17
 */
public class 剑指_Offer_17_打印从1到最大的n位数 {

    public static void main(String[] args) {
        System.out.printf(printNumbers(2));
    }
    public  int[] printNumbers(int n) {
        int max = (int) Math.pow(10,n) - 1;
        int[] numbers = new int[max];
        for (int i = 0; i < max ; i++) {
            numbers[i] = i+1;
        }
        return numbers;
    }

}
