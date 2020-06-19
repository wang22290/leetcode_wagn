package 字符串;

/**
 * 125. 验证回文串
 * https://leetcode-cn.com/problems/valid-palindrome/
 * created by wagn on 2020/6/19
 */
public class _125_验证回文串 {

    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }

    public static boolean isPalindrome(String s) {
        String s2 = s.replaceAll("[^A-Za-z0-9]","").toUpperCase();
        int left = 0;
        int right = s2.length() -1;
        for (int i = 0; i < s2.length(); i++) {
            if (left <= right) {
                if (s2.charAt(left) != s2.charAt(right)) {
                    return false;
                }
                left++;
                right--;
            }
        }
        return true;
    }

}


    // char[] chars= s.replaceAll("[^0-9a-zA-Z]", "").toLowerCase().toCharArray();
    // int len = chars.length-1;
    // int num = chars.length/2;
    // int pre = 0;
    // while(num>0){
    //     if(chars[len] != chars[pre]){
    //         return false;
    //     }
    //     len--;
    //     num--;
    //     pre++;
    // }
    // return true;
//    int i=0;
//    int j=s.length()-1;
//		while(i<j) {
//        char ic=s.charAt(i);
//        char jc=s.charAt(j);
//        if(ic==jc) {
//        i++;
//        j--;
//        }
//        //判断字符串中的的内容是否为数字或者字母
//        else if(ic < '0' || (ic > '9' &&  ic < 'A') || (ic > 'Z' && ic < 'a') || ic > 'z') {
//        i++;
//        }else if(jc < '0' || (jc > '9' &&  jc < 'A') || (jc > 'Z' && jc < 'a') || jc  > 'z') {
//        j--;
//        //字母大小写都可以
//        }else if(ic > '9' && jc > '9' && Math.abs(ic - jc) == 32) {
//        i++;
//        j--;
//        }else {
//        return false;
//        }
//
//
//        }
//        return true;