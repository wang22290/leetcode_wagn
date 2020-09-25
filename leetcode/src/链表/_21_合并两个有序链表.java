package 链表;

/**
 *21. 合并两个有序链表
 * https://leetcode-cn.com/problems/merge-two-sorted-lists/
 * created by wagn on 2020/4/21
 */
public class _21_合并两个有序链表 {

    public static void main(String[] args) {

    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dum = new ListNode(0), cur = dum;
        while (l1 != null && l2 != null){
            if (l1.val < l2.val){
                cur.next = l1;
                l1 = l1.next;
            }else {
                cur.next = l2;
                l2 = l2.next;
            }
            cur = cur.next;
        }
        cur.next = l1 != null ? l1 : l2;
        return dum.next;
    }

//    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
//        if (l1 == null){
//            return l2;
//        }
//        else if (l2 == null){
//            return l1;
//        }
//        else if (l1.val < l2.val){
//            l1.next = mergeTwoLists(l1.next,l2);
//            return l1;
//        }
//        else if (l2.val < l1.val){
//            l2.next = mergeTwoLists(l1,l2.next);
//            return l2;
//        }
//        return null;
//    }
}


