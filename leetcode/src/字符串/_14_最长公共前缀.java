package 字符串;

/**
 * created by wagn on 2020/6/15
 */
public class _14_最长公共前缀 {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0){
            return "";
        }
        String commonString = strs[0];
        for (int i = 1; i < strs.length; i++) {
            int j = 0;
            for (; j < strs[i].length() && j < commonString.length() ; j++) {
                if (commonString.charAt(j) != strs[i].charAt(j)){
                    break;
                }
            }
            commonString = commonString.substring(0,j);
            if (commonString.equals("")){
                return commonString;
            }
        }
        return commonString;
    }

}
