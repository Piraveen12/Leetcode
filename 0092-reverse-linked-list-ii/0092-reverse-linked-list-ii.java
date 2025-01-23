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
    public ListNode ReverseLinkList(ListNode head,ListNode end){
        ListNode prev=null,next=null;
        while(head!=null && head!=end){
            next=head.next;
            head.next=prev;
            prev=head;
            head=next;
        }
        return prev;
    }
    public ListNode reverseBetween(ListNode head, int left, int right) {    
        if(left==right){
            return head;
        }
        int count=1;
        ListNode leftside=null;
        ListNode rightside=null;
        ListNode head2=head;
        while(head2!=null){
            if(count==left){
                leftside=head2;
            }
            if(count==right+1){
                rightside=head2;
            }
            count++;
            head2=head2.next;
        }
        head2=head;
        ListNode right1=rightside;
        ListNode temp=ReverseLinkList(leftside,rightside);
        ListNode ans=new ListNode(-1);
        ListNode pointer=ans;
        count=1;
        while(count!=left){
            ans.next=new ListNode(head2.val);
            head2=head2.next;
            ans=ans.next;
            count++;
        }
        while(temp!=null){
            ans.next=new ListNode(temp.val);
            temp=temp.next;
            ans=ans.next;
            count++;
        }
        while( count != right && right1!=null){
            ans.next=new ListNode(right1.val);
            right1=right1.next;
            ans=ans.next;
            count++;
        }

        return pointer.next;
    }
}