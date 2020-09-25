package 剑指offer;

/**
 * created by wagn on 2020/9/18
 */
public class _05_替换空格 {
    public static void main(String[] args) {

    }
    public static String replaceSpace(String s) {
        StringBuffer res = new StringBuffer();
        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            if (sChar == ' '){
                res.append("%20");
            }else {
                res.append(sChar);
            }
        }
        return res.toString();
    }
}
