package 字符串;

/**
 * 剑指 Offer 58 - II. 左旋转字符串
 * https://leetcode-cn.com/problems/zuo-xuan-zhuan-zi-fu-chuan-lcof/
 * created by wagn on 2020/9/17
 */
public class _剑指_Offer_58_2_左旋转字符串 {

    public static void main(String[] args) {

        System.out.printf(reverseLeftWords("lrloseumgh",6));
    }


    static public String reverseLeftWords(String s, int n) {

        if (s.length() < 2 )return s;

        if (n > s.length()) return null;
        String beginString = "";
        String endString = "";
        beginString = s.substring(0,n);
        endString = s.substring(n ,s.length());
        return endString + beginString;
    }
}
