package 字符串;

/**
 * 415. 字符串相加
 * https://leetcode-cn.com/problems/add-strings/
 * created by wagn on 2020/8/3
 */
public class _415_字符串相加 {

    public static void main(String[] args) {
        System.out.println(addStrings("9","99"));
    }

    public static String addStrings(String num1, String num2) {
        StringBuffer res = new StringBuffer();
        int i = num1.length() -1;
        int j = num2.length() -1;
        int carry = 0;
        while (i >= 0 || j >=0){
            int n1 = i >= 0 ?num1.charAt(i) - '0':0;
            int n2 = j >= 0 ?num2.charAt(j) - '0':0;
            int temp = n1 + n2 + carry;
            carry = temp/10;
            res.append(temp%10);
            i--;
            j--;
        }
        if (carry == 1){
            res.append(1);
        }
        return res.reverse().toString();
    }

}
