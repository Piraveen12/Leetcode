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
    public ListNode oddEvenList(ListNode head) {
        if( head == null&& head.next==null){
            return head;
        }
         ListNode temp =new ListNode(-1);
         ListNode result=temp;
         ListNode head1=head;
         int count=1;
        while(head1!=null){
            if(count%2 != 0){
                temp.next= new ListNode(head1.val);
                temp=temp.next;
            }
            count++;
            head1=head1.next;

        }
        count = 1;
        while(head!= null){
            if(count%2==0){
                temp.next=new ListNode(head.val);
                temp = temp.next;
            }
            count++;
            head=head.next;
        }
        return result.next;
    }
}