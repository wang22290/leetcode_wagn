package 动态规划;

/**
 * created by wagn on 2020/7/18
 */
public class 零钱 {
    public static void main(String[] args) {
        System.out.println(coins(41));
    }

    static int coins(int n){
        if (n < 1) return Integer.MAX_VALUE;
        if (n == 25 || n == 20 || n == 5 || n == 1)return 1;
        int min1 = Math.min(coins(n -25),coins(n-20));
        int min2 = Math.min(coins(n -5),coins(n-1));
        return Math.min(min1,min2) +1;

    }


}
