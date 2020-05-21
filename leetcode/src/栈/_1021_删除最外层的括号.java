package 栈;

import java.util.Stack;

/**
 * 1021. 删除最外层的括号
 * https://leetcode-cn.com/problems/remove-outermost-parentheses/
 * created by wagn on 2020/4/24
 */
public class _1021_删除最外层的括号 {
    public static void main(String[] args) {
//       removeOuterParentheses("(())))))(((((");
        System.out.println(removeOuterParentheses1("(())((()))((()))"));
    }


    public static String removeOuterParentheses(String S) {
        Stack<Character > stack = new Stack<>();
        StringBuilder builder = new StringBuilder();

        int start = 0;  //原句开始位置
        int end = 0;    //原句结束位置
        boolean isflag = false; //标志每一个原句
        for (int i = 0; i < S.length(); i++) {
            char tempChar = S.charAt(i);
            if (tempChar == '('){
                stack.push(tempChar);
                if (!isflag){
                    start = i;
                    isflag = true;
                }
            }
            if (tempChar == ')'){
                stack.pop();
                if (stack.size() == 0){ //
                    end = i;
                    builder.append(S.substring(start+ 1,end));
                    isflag = false;
                    start = end;

                }
            }
        }
        return builder.toString();
    }

    public static String removeOuterParentheses1(String S) {
        StringBuilder sb = new StringBuilder();
        int level = 0;
        for (char c : S.toCharArray()) {
            if (c == ')') {
                --level;
            }
            if (level >= 1){
                sb.append(c);
            }
            if (c == '('){
                ++level;
            }
        }
        return sb.toString();
    }

}
