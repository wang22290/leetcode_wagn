package 动态规划;

/**
 * 392. 判断子序列
 *
 * https://leetcode-cn.com/problems/is-subsequence/
 * created by wagn on 2020/7/27
 */
public class _392_判断子序列 {

    public static void main(String[] args) {

    }

    public boolean isSubsequence(String s, String t) {
        int i = 0;
        for (char ch : s.toCharArray()) {
            // 找到 t 上第一个匹配的 ch
            while (i < t.length() && t.charAt(i) != ch) i++;
            // 如果 t 穷尽，跳出，注意始终对 i 加一
            if (i++ >= t.length()) break;
        }
        return i <= t.length();
    }

}
