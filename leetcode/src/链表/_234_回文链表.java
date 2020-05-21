package 链表;

import java.util.ArrayList;
import java.util.List;

/**
 * 234. 回文链表
 * https://leetcode-cn.com/problems/palindrome-linked-list/
 * created by wagn on 2020/4/23
 */
public class _234_回文链表 {

    public static void main(String[] args) {

        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(0);
        ListNode node3 = new ListNode(1);
        node1.next = node2;
        node2.next = node3;
        System.out.println(isPalindrome(node1));

    }


//    public static boolean isPalindrome(ListNode head) {
//        List list = new ArrayList();
//        while (head != null){
//            list.add(head.val);
//            head = head.next;
//        }
//        int firstIndex = 0;
//        int last = list.size() -1;
//        while(firstIndex < last){
//            if (!list.get(firstIndex).equals(list.get(last))) {
//                return false;
//            }
//            firstIndex ++;
//            last --;
//        }
//        return true;
//    }

        public static boolean isPalindrome(ListNode head) {
        if (head == null)return true;

            // Find the end of first half and reverse second half.
            ListNode firstHalfEnd = endOfFirstHalf(head);
            ListNode secondHalfStart = reverseList(firstHalfEnd.next);

            // Check whether or not there is a palindrome.
            ListNode p1 = head;
            ListNode p2 = secondHalfStart;
            boolean result = true;
            while (result && p2 != null) {
                if (p1.val != p2.val) result = false;
                p1 = p1.next;
                p2 = p2.next;
            }

            // Restore the list and return the result.
            firstHalfEnd.next = reverseList(secondHalfStart);
            return result;

        }

        //找到listNode 的中点
    private static ListNode endOfFirstHalf(ListNode head){
        ListNode slowNode = head;
        ListNode fastNode = head.next;
        while (fastNode.next != null && fastNode.next.next != null){
            slowNode = slowNode.next;
            fastNode = fastNode.next.next;
        }
        return slowNode;
    }
    //反转列表
    private static ListNode reverseList(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        while (curr != head){
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }
}



