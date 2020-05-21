package 字符串;

/**
 * 面试题58 - II. 左旋转字符串
 * https://leetcode-cn.com/problems/zuo-xuan-zhuan-zi-fu-chuan-lcof/
 * created by wagn on 2020/4/27
 */
public class _面试题58_左旋转字符串_2 {


    public static void main(String[] args) {
        System.out.println(reverseLeftWords("lrloseumgh",6));
    }

    public static String reverseLeftWords(String s, int n) {
        String tempS1 = s.substring(0,n);
        String tempS2 = s.substring(n,s.length());
        return tempS2 + tempS1;
    }
}
