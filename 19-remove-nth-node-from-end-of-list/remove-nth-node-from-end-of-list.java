/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null||head.next==null)return null;
        ListNode temp=head;
        int i=0;
        while(temp!=null)
        {
            i++;
            temp=temp.next;
        }
        temp=head;
        if(n==i)
        {
            head=temp.next;
            return head;
        }
        int size=i-n;
        i=0;
        while(temp.next!=null && i<size-1)
        {
            temp=temp.next;
            i++;
        }
        temp.next=temp.next.next;
        return head;
    }
}