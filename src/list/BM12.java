package list;

import java.util.HashMap;

public class BM12 {
    public static ListNode sortInList (ListNode head) {
        // write code here
        if(head==null||head.next==null) {
            return head;
        }
        ListNode nhead = new ListNode(-1);
        nhead.next = head;
 
        return nhead.next;
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(3);
        ListNode c = new ListNode(2);
        ListNode d = new ListNode(4);
        ListNode e = new ListNode(5);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        System.out.println(sortInList(a));

    }
}
