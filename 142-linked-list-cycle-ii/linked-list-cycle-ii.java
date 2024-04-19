/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        boolean loop=false;
      
        while(fast!=null&&fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
            {
                loop=true;
                break;
            }
        }
       if(!loop)return null;
        HashSet<ListNode> s=new HashSet<ListNode>();
         ListNode temp=head;
         while(temp!=null)
         {
            if(s.contains(temp))
            {
                return temp;
            }
            else{
                s.add(temp);
                temp=temp.next;
            }
         }
       
        return null;
    }
}
