package 数学;

/**
 *9. 回文数
 * https://leetcode-cn.com/problems/palindrome-number/
 * created by wagn on 2020/6/10
 */
public class _9_回文数 {

    public static void main(String[] args) {

        System.out.println(isPalindrome(121));
    }

    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        String s = String.valueOf(x);
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) == s.charAt(right)) {
                left++;
                right--;
            } else {
                return false;
            }

        }
        return true;
    }

}


//    int left = 0;
//    int right = s.length() -1;
//      while (left < right){
//        if (s.charAt(left) == s.charAt(right)){
//        left ++;
//        right --;
//        }else {
//        boolean isleftTrue = true;
//        boolean isRightTure = true;
//        for (int i = left,  j = right -1 ; i < j ; i++ , j--) {
//        if (s.charAt(i) != s.charAt(j)){
//        isleftTrue = false;
//        break;
//        }
//        }
//        for (int i = left + 1,  j = right  ; i < j ; i++ , j--) {
//        if (s.charAt(i) != s.charAt(j)){
//        isRightTure = false;
//        break;
//        }
//        }
//        return isleftTrue || isRightTure;
//        }
//        }
//        return true;
//        }
