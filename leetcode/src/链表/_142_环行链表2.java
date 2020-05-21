package 链表;

/**
 * 142. 环形链表 II
 *  https://leetcode-cn.com/problems/linked-list-cycle-ii/
 * created by wagn on 2020/4/21
 */
public class _142_环行链表2 {
    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) return null;
        ListNode slowNode = head;
        ListNode fastNode = head.next;
        if (fastNode != null || fastNode.next != null){
            slowNode = slowNode.next;
            fastNode = fastNode.next.next;
            if (slowNode == fastNode){
                int a = 0;
                while (head != null){
                    head = head.next;
                    a++;
                    if (head == slowNode){
                        System.out.println("tail connects to"+ head + "index" + a);
                        return head;
                    }
                }
            }
        }
        return null;
    }
}
