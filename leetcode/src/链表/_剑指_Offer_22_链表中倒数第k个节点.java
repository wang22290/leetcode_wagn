package 链表;

import java.util.List;

/**
 *
 * 剑指 Offer 22. 链表中倒数第k个节点
 * https://leetcode-cn.com/problems/lian-biao-zhong-dao-shu-di-kge-jie-dian-lcof/
 * created by wagn on 2020/9/17
 */
public class _剑指_Offer_22_链表中倒数第k个节点 {


    public static void main(String[] args) {

    }


    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode format = head, later = head;
        for (int i = 0; i < k; i++) {
            format = format.next;
        }
        while (format != null) {
            format = format.next;
            later = later.next;
        }

        return later;
    }
}
