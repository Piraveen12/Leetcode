/**
 * Definition for singly-linked list.
 * public class() ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode modifiedList(int[] nums, ListNode head) {
         ListNode dum=new ListNode(0);
         dum.next=head;
         Set<Integer>res=new HashSet<>();
         for(int num:nums){
            res.add(num);
         }
        ListNode current=dum;
        while(current.next!=null){
            if(res.contains(current.next.val)){
                current.next=current.next.next;
            }
            else{
                current=current.next;
            }
        }
        return dum.next;
    }
}