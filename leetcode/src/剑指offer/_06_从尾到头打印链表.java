package 剑指offer;

import 链表.ListNode;

import java.util.ArrayList;

/**
 * created by wagn on 2020/9/18
 */
public class _06_从尾到头打印链表 {
    public static void main(String[] args) {

    }

    static ArrayList<Integer> tep = new  ArrayList<Integer>();
    public static int[] reversePrint(ListNode head) {
        recur(head);
        int[] list = new int[tep.size()];

        for (int i = 0; i < tep.size(); i++) {
            list[i] = tep.get(i);
        }
        return list;
    }

    public static void  recur(ListNode head){
        if (head == null) return;
        recur(head.next);
        tep.add(head.val);
    }


}
