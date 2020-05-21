package 字符串;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 680. 验证回文字符串 Ⅱ
 * https://leetcode-cn.com/problems/valid-palindrome-ii/submissions/
 * 贪心算法
 * created by wagn on 2020/5/19
 */
public class _680_验证回文字符串_2 {

    public static void main(String[] args) {

        System.out.println(validPalindrome("abca"));
    }

    public static boolean validPalindrome(String s) {
      int left = 0;
      int right = s.length() -1;
      while (left < right){
          if (s.charAt(left) == s.charAt(right)){
              left ++;
              right --;
          }else {
              boolean isleftTrue = true;
              boolean isRightTure = true;
              for (int i = left,  j = right -1 ; i < j ; i++ , j--) {
                  if (s.charAt(i) != s.charAt(j)){
                      isleftTrue = false;
                      break;
                  }
              }
              for (int i = left + 1,  j = right  ; i < j ; i++ , j--) {
                  if (s.charAt(i) != s.charAt(j)){
                      isRightTure = false;
                      break;
                  }
              }
              return isleftTrue || isRightTure;
          }
      }
        return true;
    }
}
