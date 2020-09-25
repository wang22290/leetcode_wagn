package 剑指offer;

/**
 * 面试题64. 求1+2+…+n
 * https://leetcode-cn.com/problems/qiu-12n-lcof/
 * 求 1+2+...+n ，要求不能使用乘除法、for、while、if、else、switch、case等关键字及条件判断语句（A?B:C）。
 * created by wagn on 2020/6/2
 */
public class _64_求123n之和 {

    public static void main(String[] args) {
        sumNums(6);
    }

    public static int sumNums(int n) {
        System.out.println("diyicidayin" + n);
        boolean falg = n > 0 && (n += sumNums(n -1)) > 0;
        System.out.println("dayin" + n);
        return n;
    }
}
