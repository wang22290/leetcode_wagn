package 数组;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * created by wagn on 2020/9/21
 */
public class sum_6 {


    public static void main(String[] args) {


        System.out.println(  sum(110000,120000));
    }



    public  static int sum(int M, int N){
        int number = 0;
        int ge = 0;
        int shi = 0;
        int bai = 0;
        int qian = 0;
        int wan = 0;
        int swan = 0;
        List list = new LinkedList();
        for (int i = M; i < N; i++) {
            ge = i % 100000 % 10000 % 1000 % 100 % 10; // 这个bai代表个位数du
            shi = i % 100 / 10; // 这个代表十位数
            bai = i % 1000 / 100; // 这个代表百位数
            qian = i %10000 / 1000; //这个代表千位zhi数
            wan = i %100000 / 10000; //这个代表千位zhi数
            swan = i  / 100000; //这个代表千位zhi数
            System.out.println(swan + "-" + wan + "-" + qian +  "-" + bai +  "-" + shi +  "-" + ge);

            Map<Integer,Integer> map = new HashMap();
            map.put(1,ge);

            if ( (swan != 0) && (qian != 0) && (shi != 0)  ){
                if (swan * 10 + wan + qian * 10 + bai  == shi * 10 + ge){
                    list.add(i);
                    number ++;
                }
            }
        }
        return number;
    }
}
//