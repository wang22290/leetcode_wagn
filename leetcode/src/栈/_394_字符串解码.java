package 栈;

import java.util.LinkedList;

/**
 * 394. 字符串解码
 * https://leetcode-cn.com/problems/decode-string/
 * created by wagn on 2020/5/28
 */
public class _394_字符串解码 {

    public static void main(String[] args) {

    }

    public static String decodeString(String s) {

        StringBuffer res = new StringBuffer();
        int multi = 0;
        LinkedList<Integer> stack_multi = new LinkedList<>();
        LinkedList<String> stack_res = new LinkedList<>();
        for (Character c : s.toCharArray()){
            if (c == '['){
                stack_multi.addLast(multi);
                stack_res.addLast(res.toString());
                multi = 0;
                res = new StringBuffer();
            }
            else  if (c == ']'){
                StringBuffer temp = new StringBuffer();
                int cur_multi = stack_multi.removeLast();
                for (int i = 0; i <cur_multi ; i++) {
                    temp = temp.append(res);
                }
                res = new StringBuffer(stack_res.removeLast() + temp);
            }else if (c >= '0' && c <= '9'){
                multi = multi * 10 + Integer.parseInt(c + "");

            }else {
                res.append(c);
            }
        }
        return res.toString();
    }
}
