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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode temp=new ListNode(-1);
        ListNode temp1=temp;
        while(list1!=null && list2!=null){
            if(list2.val > list1.val){
                temp.next = new ListNode(list1.val);
                temp = temp.next;
                list1=list1.next;
            }
            else{
                temp.next= new ListNode(list2.val);
                temp=temp.next;
                list2=list2.next;
            }
        }
        while(list1!=null){
            temp.next=new ListNode(list1.val);
            list1=list1.next;
            temp=temp.next;
        }
        while(list2!=null){
            System.out.println(list2.val);
            temp.next=new ListNode(list2.val);
            temp=temp.next;
            list2=list2.next;
        }
        return temp1.next;
    }
}