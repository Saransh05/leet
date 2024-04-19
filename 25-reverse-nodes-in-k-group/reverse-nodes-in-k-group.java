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
    public ListNode reverseKGroup(ListNode head, int k) {
        //Your code here
        ListNode temp=head;
        ListNode prevLast= null;
        while (temp!=null)
        {
            ListNode kthnode=kth(temp,k);
            if(kthnode==null)
            {
                if(prevLast!=null)
                {
                    prevLast.next=temp;
                }
                break;
            }
        
            ListNode nextnode=kthnode.next;
            kthnode.next=null;
            reverseLinkedList(temp);
            if(temp==head)
            {
                head=kthnode;
            }
            else{
                prevLast.next=kthnode;
            }
             prevLast = temp;
             temp=nextnode;
             }
             return head;
    }
       static ListNode reverseLinkedList(ListNode head)
       {
           ListNode temp=head;
           ListNode curr=null;
           while(temp!=null)
           {
               ListNode temp1=temp.next;
               temp.next=curr;
               curr=temp;
               temp=temp1;
           }
           return curr;
       }
       static ListNode kth(ListNode temp,int a)
       {
           int i=1;
           while(i<a && temp!= null)
           {
               temp=temp.next;
               i++;
           }
           return temp;
       }
    }
