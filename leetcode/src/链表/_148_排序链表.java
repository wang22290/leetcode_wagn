package 链表;

/**
 * 148. 排序链表
 * https://leetcode-cn.com/problems/sort-list/
 * created by wagn on 2020/4/23
 */
public class _148_排序链表 {

    public ListNode sortList(ListNode head) {
        if (head.next == null ||head == null){
            return head;
        }else {
            while (head.next != null){
                sortList(head.next);
                head = head.next;
            }

        }
        return null;
    }
}
