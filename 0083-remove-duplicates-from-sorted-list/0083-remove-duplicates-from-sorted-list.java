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
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null ||head.next==null){
            return head;
        }
        ListNode ans =head;
        ListNode next=head.next; 
        while(next!=null){
            ListNode prev=ans;
            if(ans.val!=next.val){
                ans=ans.next;
                next=next.next;
            }
            if(next!=null && ans.val == next.val ){
                ans.next=next.next;
                next=next.next;
            }
        } 
        return head;
    }
}