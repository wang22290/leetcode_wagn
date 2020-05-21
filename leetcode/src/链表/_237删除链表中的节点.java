package 链表;

/**
 *  _237删除链表中的节点
 * https://leetcode-cn.com/problems/delete-node-in-a-linked-list/
 * created by wagn on 2020/4/20
 */
public class _237删除链表中的节点 {
    public static void main(String[] args) {
        System.out.println("1111");

    }


    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
