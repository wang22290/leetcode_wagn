package 链表;

/**
 * 141. 环形链表
 * https://leetcode-cn.com/problems/linked-list-cycle/
 * created by wagn on 2020/4/20
 */
public class _141_是否有环 {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null)return false;
       ListNode slowNode = head;
       ListNode fastNode = head.next;
       while (fastNode != null && fastNode.next != null){
           slowNode = slowNode.next;
           fastNode = fastNode.next.next;
           if (slowNode == fastNode){
               return true;
           }
       }
       return false;
    }
}
