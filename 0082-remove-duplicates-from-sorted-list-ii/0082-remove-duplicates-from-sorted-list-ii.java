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
        HashMap<Integer,Integer> countMap =new HashMap<>();
        ListNode current=head;
        while(current!= null){
            countMap.put(current.val, countMap.getOrDefault(current.val, 0) + 1);
            current = current.next;
        }
        ListNode dummy=head;
        ListNode prev=new ListNode(-1);
        ListNode result=prev;
        while(dummy!=null){
            if(countMap.get(dummy.val)==1){
                prev.next=dummy;
                prev=prev.next;
                
            }
            
            dummy=dummy.next;
        }
         prev.next=null;
        return result.next;
    }
}