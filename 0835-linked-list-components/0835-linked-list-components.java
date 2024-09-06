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
    public int numComponents(ListNode head, int[] nums) {
        
        Set <Integer> res=new HashSet<>();
        for(int i:nums){
            res.add(i);
        }
        int result=0;
        boolean comp=false;
        while(head!=null){
            if(res.contains(head.val)){
                if(!comp){
                    result++;
                    comp=true;
                }
                
            }
            else{
                 comp=false;
            }
            head=head.next;
        }
        return result;
    }
}