package 字符串;

import java.util.*;

/**
 * 336. 回文对
 * https://leetcode-cn.com/problems/palindrome-pairs/
 * created by wagn on 2020/8/6
 */
public class _336_回文对 {

    public static void main(String[] args) {

//        ["bat","tab","cat"]
String[] words = {"bat","tab","cat"};
        System.out.println(palindromePairs(words));

    }
    static List<String> wordsRev = new ArrayList<String>();
    static Map<String,Integer> indic = new HashMap<>();
    public static List<List<Integer>> palindromePairs(String[] words) {
        int n = words.length;
        for (String word: words){
            wordsRev.add(new StringBuffer(word).reverse().toString());
        }

        for (int i = 0; i < n; ++i) {
            indic.put(wordsRev.get(i),i);
        }

        List<List<Integer>> ret = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String word = words[i];
            int m = word.length();
            if (m == 0){
                continue;
            }
            for (int j = 0; j <= m; j++) {
                if (isPalindrome(word,j,m -1)){
                    int leftID = findWord(word,0,j-1);
                    if (leftID != -1 && leftID != i){
                        ret.add(Arrays.asList(i,leftID));
                    }
                }
                if (j!= 0 && isPalindrome(word,0,j-1)){
                    int rightID = findWord(word,j,m-1);
                    if (rightID != -1 && rightID != i){
                        ret.add(Arrays.asList(rightID,i));
                    }
                }
            }
        }

        return ret;
    }


    public  static  boolean isPalindrome(String s,int left ,int right){
        int len = right - left + 1;
        for (int i = 0; i < len/2; i++) {
            if (s.charAt(left + 1) != s.charAt(right -1)){
                return false;
            }
        }
        return true;
    }
    public static int findWord (String s, int left, int right){
        return indic.getOrDefault(s.substring(left,right + 1),-1);
    }


}


class Solution {
    List<String> wordsRev = new ArrayList<String>();
    Map<String, Integer> indices = new HashMap<String, Integer>();

    public List<List<Integer>> palindromePairs(String[] words) {
        int n = words.length;
        for (String word: words) {
            wordsRev.add(new StringBuffer(word).reverse().toString());
        }
        for (int i = 0; i < n; ++i) {
            indices.put(wordsRev.get(i), i);
        }

        List<List<Integer>> ret = new ArrayList<List<Integer>>();
        for (int i = 0; i < n; i++) {
            String word = words[i];
            int m = words[i].length();
            if (m == 0) {
                continue;
            }
            for (int j = 0; j <= m; j++) {
                if (isPalindrome(word, j, m - 1)) {
                    int leftId = findWord(word, 0, j - 1);
                    if (leftId != -1 && leftId != i) {
                        ret.add(Arrays.asList(i, leftId));
                    }
                }
                if (j != 0 && isPalindrome(word, 0, j - 1)) {
                    int rightId = findWord(word, j, m - 1);
                    if (rightId != -1 && rightId != i) {
                        ret.add(Arrays.asList(rightId, i));
                    }
                }
            }
        }
        return ret;
    }

    public boolean isPalindrome(String s, int left, int right) {
        int len = right - left + 1;
        for (int i = 0; i < len / 2; i++) {
            if (s.charAt(left + i) != s.charAt(right - i)) {
                return false;
            }
        }
        return true;
    }

    public int findWord(String s, int left, int right) {
        return indices.getOrDefault(s.substring(left, right + 1), -1);
    }
}

