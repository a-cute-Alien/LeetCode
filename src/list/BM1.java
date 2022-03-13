package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BM1 {

    public static  ListNode ReverseList(ListNode head) {
//         ListNode nhead = new ListNode(-1);
//         ListNode cur,next;
//         cur = head;
//         while(cur!=null){
//             next = cur.next;
//             cur.next = nhead.next;
//             nhead.next = cur;
//             cur = next;
//         }
//         return nhead.next;
        if (head == null || head.next == null) {
            return head;
        }
        //next 指向当前节点的下一节点 用于反转链表
        ListNode next = head.next;
        //reverseHead 指向 反转后的新头节点 其实一直指向 tail 节点 没有改变，一直返回该节点而已
        ListNode reverseHead = ReverseList(head.next);
        next.next = head;
        head.next = null;
        return reverseHead;

    }

    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        a.next=b;b.next=c;
        ReverseList(a);
        
    }
}
