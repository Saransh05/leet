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
    public boolean isPalindrome(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null&&fast.next.next!= null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode rev=reverseList(slow.next);
        ListNode test=head;
        while(rev!=null)
        {
          if(test.val!=rev.val)
          {
            return false;
          }
          else{
           rev=rev.next;
           test=test.next;
          }
        }
        return true;
    }
    ListNode reverseList(ListNode head)
    {
        ListNode temp=null;
        ListNode curr=head;
        while(curr!=null)
        {
            ListNode temp1=curr.next;
            curr.next=temp;
            temp=curr;
            curr=temp1;
        }
        return temp;
    }
}