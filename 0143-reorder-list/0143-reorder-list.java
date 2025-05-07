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
     private ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode next = null;
        while (head != null) {
            next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }
 
    private void display(ListNode temp) { 
        while (temp != null) {
            System.out.println(temp.val);
            temp = temp.next;
        }
    }
    public void reorderList(ListNode head) {
        if(head == null || head.next == null){
            return ;
        }
       ListNode slow =  head;
       ListNode fast  = head;
       while(fast != null && fast.next != null){
        slow = slow.next;
        fast = fast.next.next;
       }

       ListNode second =  reverse(slow.next);
       slow.next =  null;
       ListNode first = head;
       while(second != null){
        ListNode temp = first.next,temp1 = second.next;
        first.next  = second;
        second.next = temp;
        first = temp;
        second = temp1;
       }
    }
}