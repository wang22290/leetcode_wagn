package 链表;

/**
 * 876. 链表的中间结点
 * https://leetcode-cn.com/problems/middle-of-the-linked-list/
 * created by wagn on 2020/4/21
 */
public class _876_链表的中间结点 {

    public ListNode middleNode(ListNode head) {
        if (head.next == null) return head;
        ListNode slowNode = head;
        ListNode fastNode = head.next;
        while (fastNode.next != null){
            slowNode = slowNode.next;
            fastNode = fastNode.next.next;
            if (fastNode == null){
                return slowNode;
            }
        }
        return null;
    }
}
