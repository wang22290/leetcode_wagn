package 栈;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 1047. 删除字符串中的所有相邻重复项
 * https://leetcode-cn.com/problems/remove-all-adjacent-duplicates-in-string/
 * created by wagn on 2020/4/24
 */
public class _1047_删除字符串中的所有相邻重复项 {
    public static void main(String[] args) {

        System.out.println(removeDuplicates("abbaca"));
    }
    public static String removeDuplicates(String S) {
        StringBuilder builder = new StringBuilder();
        char[] chars = S.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (builder.length() == 0){
                builder.append(chars[i]);
            }else {
                if (chars[i] == builder.charAt(builder.length() -1)){
                  builder.deleteCharAt(builder.length() -1);
                }else {
                  builder.append(chars[i]);
                }
            }
        }
        return builder.toString();


//        Stack<Character> stack = new Stack<>();
//          char[] chars = S.toCharArray();
//        for (int i = 0; i < chars.length; i++) {
//            if (stack.size() == 0){
//                stack.push(chars[i]);
//            }else {
//                if (chars[i] == stack.lastElement()){
//                    stack.pop();
//                }else {
//                    stack.push(chars[i]);
//                }
//            }
//        }
//        return stack.toString();
    }

}
