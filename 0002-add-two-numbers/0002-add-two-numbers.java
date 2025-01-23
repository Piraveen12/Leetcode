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
     
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
       ListNode result =new ListNode(-1);
       int carry=0;
       ListNode ans=result;
       while(l1!=null && l2!=null){
        int sum=l1.val+l2.val+carry;
      
        result.next=new ListNode(sum%10);
        carry=sum/10;
        l1=l1.next;
        l2=l2.next;
        result=result.next;
       }
       while(l1 != null && l2 == null){
        int sum=carry+l1.val;
        result.next=new ListNode(sum%10);
        System.out.println(result.val);
        carry=sum/10;
        l1=l1.next;
        result=result.next;
       }
       
       while(l2 != null ){
        int sum=carry+l2.val;
        result.next=new ListNode(sum%10);
        carry=sum/10;
        l2=l2.next;
        result=result.next;
       }
        if(carry > 0){
            result.next=new ListNode(carry);
        }
       return ans.next;
    }
}