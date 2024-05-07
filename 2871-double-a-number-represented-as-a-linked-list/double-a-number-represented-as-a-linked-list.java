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
    public ListNode doubleIt(ListNode head) {

        ListNode prev=null,curr=head,ns=null;
        int carry =0;

        while(curr!=null){
            ns=curr.next;
            curr.next=prev;
            prev=curr;
            curr=ns;
        }
        curr=prev;
        while(prev!=null){
            int x=prev.val *2;
            x=x+carry;
            carry=0;
            if(x>9){
                prev.val=x-10;
                carry=1;
            }else{
                prev.val=x;
            }
            prev=prev.next;
        }

        prev=null;
        ns=null;
        while(curr!=null){
            ns=curr.next;
            curr.next=prev;
            prev=curr;
            curr=ns;
        }

        if(carry >0){
            ListNode ls=new ListNode(carry);
            ls.next=prev;
            prev=ls;

        }
        
        return prev;
    }
}