package 字符串;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * 20. 有效的括号
 * https://leetcode-cn.com/problems/valid-parentheses/
 * created by wagn on 2020/8/14
 */
public class _20_有效的括号 {

    public static void main(String[] args) {

String sre = "()";
        System.out.println(isValid(sre));
    }


    public static boolean isValid(String s) {

        char[] chars = s.toCharArray();
        int leng = chars.length;
        if (s == null)return false;
        if (leng % 2 != 0) return false;
        int left = 0;
        int right =leng - 1;
        Map<Character, Character> pairs = new HashMap<Character, Character>() {{
            put(')', '(');
            put(']', '[');
            put('}', '{');
        }};

        Deque<Character> stack = new LinkedList<Character>();
        for (int i = 0; i < leng; i++) {
            char ch = chars[i];
            if (pairs.containsKey(ch)){
                if (stack.isEmpty() || stack.peek() != pairs.get(ch)){
                    return false;
                }
                stack.pop();
            }else {
                stack.push(ch);
            }
        }
        return stack.isEmpty();
    }
}
