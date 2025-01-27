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
        if(head==null ){
            return null;
        }
        if(head.next==null){
            return null;
        }
        ListNode slow=head;
        ListNode fast=head;
        while(slow!=null && fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(fast == slow){
                break;
            }
        }
        ListNode ans= head;
        
        while(ans!=null && fast!=null){
            if(ans == fast){
                return ans;
            }
            ans=ans.next;
            fast = fast.next;
        
        }
        return null;
    }
}