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
    public boolean isPalindrome(ListNode head) {
        Stack<Integer> res=new Stack<>();
        ListNode th=head;
        while(th!=null){
            res.push(th.val);
            th=th.next;
        }
        while(head!=null){
            if(head.val!=res.pop()){
                return false;
            }
            head=head.next;
        }
        return true;
    }
}