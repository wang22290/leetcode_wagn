package 链表;

/**
 *83. 删除排序链表中的重复元素
 * https://leetcode-cn.com/problems/remove-duplicates-from-sorted-list/
 * created by wagn on 2020/4/21
 */
public class _83_删除排序链表中的重复元素 {

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode prev = head;
        while (prev.next != null) {

            if (prev.val == prev.next.val) {
                prev.next = prev.next.next;
            } else {
                prev = prev.next;
            }

        }
        return head;
    }
}
