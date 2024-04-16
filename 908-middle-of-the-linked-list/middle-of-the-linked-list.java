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
    public ListNode middleNode(ListNode head) {
        ListNode temp=head;
        int c=1,d=0;
        if(head==null)
        {
            return null;
        }
        while(temp.next!=null)
        {
             temp=temp.next;
             c++;
        }
        if(c%2==0)
        {
            ListNode temp1=head;
            int e=c/2;
            while(d!=e)
            {
                temp1=temp1.next;
                d++;
            }
            return temp1;
        }
        else{
            ListNode temp1=head;
            int e=c/2;
            while(d!=e)
            {
                temp1=temp1.next;
                d++;
            }
            return temp1;
        }
    }
}