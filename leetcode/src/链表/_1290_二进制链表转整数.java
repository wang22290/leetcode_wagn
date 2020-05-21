package 链表;

/**
 * 1290. 二进制链表转整数
 * https://leetcode-cn.com/problems/convert-binary-number-in-a-linked-list-to-integer/
 * created by wagn on 2020/4/22
 */
public class _1290_二进制链表转整数 {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(0);
        ListNode node3 = new ListNode(1);
        node1.next = node2;
        node2.next = node3;

        int a = getDecimalValue(node1);
        System.out.println(a);
    }


    public static int getDecimalValue(ListNode head) {
        ListNode p = head;
        int result = 0;

        while (p != null) {
            result *= 2;
            result += p.val;
            p = p.next;
        }


        return result;
    }
}
