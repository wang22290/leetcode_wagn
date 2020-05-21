package 链表;

import java.util.List;

/**
 * 206. 反转链表
 * https://leetcode-cn.com/problems/reverse-linked-list/
 * created by wagn on 2020/4/20
 */
public class _206_反转链表 {

    public static void main(String[] args) {

    }

//    //递归方法
//    public ListNode reverseList(ListNode head) {
//        if (head.next == null || head ==null){
//            return  head;
//        }
//        ListNode newHead = reverseList(head.next);
//        head.next.next = head;
//        head.next = null;
//        return  newHead;
//    }


//    public ListNode reverseList(ListNode head) {
//        ListNode newHead = null;
//        while (head != null){
//            ListNode temp = head.next;
//            head.next = newHead;
//            newHead = head;
//            head = temp;
//        }
//    }

}
