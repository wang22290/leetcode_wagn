package 字符串;

import java.util.Dictionary;
import java.util.HashMap;
import java.util.Map;

/**
 * 1371. 每个元音包含偶数次的最长子字符串
 * https://leetcode-cn.com/problems/find-the-longest-substring-containing-vowels-in-even-counts/
 * created by wagn on 2020/5/20
 */
public class _1371_每个元音包含偶数次的最长子字符串 {
    public static void main(String[] args) {
        findTheLongestSubstring("aeleetminicoworoep");
    }

    public static int findTheLongestSubstring(String s) {

        Map<String,Integer> adic = new HashMap<>();
        Map edic = new HashMap<>();
        Map idic = new HashMap<>();
        Map odic = new HashMap<>();
        Map udic = new HashMap<>();
        for (int i = 0; i <s.length() ; i++) {
            if ('a' == s.charAt(i)){
                adic.put("a"+i ,i);
            }
            if ('e' == s.charAt(i)){
                edic.putIfAbsent("e"+i ,i);

            }
            if ('i' == s.charAt(i)){
                idic.putIfAbsent("i"+i ,i);

            }
            if ('o' == s.charAt(i)){
                odic.putIfAbsent("o"+i ,i);

            }
            if ('u' == s.charAt(i)){
                udic.putIfAbsent("u"+i ,i);

            }

        }
        System.out.println(adic + "----"+adic.size());
        System.out.println(edic + "----"+edic.size());
        System.out.println(idic + "----"+idic.size());
        System.out.println(odic + "----"+odic.size());
        System.out.println(udic + "----"+udic.size());

        return 0;
    }
}
