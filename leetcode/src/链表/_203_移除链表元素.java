package 链表;

/**
 * 203. 移除链表元素
 * https://leetcode-cn.com/problems/remove-linked-list-elements/
 * created by wagn on 2020/4/21
 */
public class _203_移除链表元素 {
    public ListNode removeElements(ListNode head, int val) {
        //头接点的处理
        while (head != null && head.val == val){
             head = head.next;
        }

        //
        if(head == null){
            return head;
        }
         //确保当前结点后还有结点
        ListNode prev = head;
        while (prev.next != null){
            if (prev.next.val == val){
                prev.next = prev.next.next;
            }else {
                prev = prev.next;
            }
        }
        return head;
    }

    //递归方式
    public ListNode removeElements2(ListNode head, int val) {
        //头接点的处理
        while (head != null && head.val == val){
            head = head.next;
        }
        head.next =  removeElements2(head,val);
        if (head.val == val){
            return head.next;
        }else {
            return head;
        }
    }
}
