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
        ListNode temp=new ListNode(-101);
        ListNode temp1=temp;
        while(head!=null){
            if(temp.val != head.val){
                System.out.println(head.val);
                temp.next=new ListNode(head.val);
                temp=temp.next;
                head=head.next;
            }
            else{
                head=head.next;
            }
        }
        return temp1.next;
    }
}