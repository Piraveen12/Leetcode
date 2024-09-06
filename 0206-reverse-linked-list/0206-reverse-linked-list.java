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
    public ListNode reverseList(ListNode head) {
        ListNode th=null;
        ListNode current=head;
        ListNode Next=head;
        while(current!=null){
            Next=current.next;
            current.next=th;
            th=current;
            current=Next;
            
             
        }        
        return th;
    }
}