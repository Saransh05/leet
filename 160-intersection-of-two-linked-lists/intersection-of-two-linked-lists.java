/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA==null||headB==null)return null;
        int c1=0;
        int c2=0;
        ListNode temp1=headA;
        ListNode temp2=headB;
        while(temp1!=null)
        {
            temp1=temp1.next;
            c1++;
        }
        while(temp2!=null)
        {
            temp2=temp2.next;
            c2++;
        }
        int traverse=Math.abs(c1-c2);
         temp1=headA;
         temp2=headB;
        if(c1>c2)
        {
           
            for(int i=0;i<traverse;i++)
            {
                temp1=temp1.next;
            }
        }
        else{
              for(int i=0;i<traverse;i++)
            {
                temp2=temp2.next;
            }
        }
        while(temp1!=temp2)
        {
            temp1=temp1.next;
            temp2=temp2.next;
        }
        return temp2;
    }
}