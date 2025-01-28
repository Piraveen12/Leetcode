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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        if(list1 != null && list2 ==  null){
            return list1;
        }
        int count = 1;
        ListNode temp1=list1;
        ListNode temp2=list1;
        for(int i =1 ;i < a ;i++){
            temp1=temp1.next;
        }
        for(int i = 0 ;i<= b ;i++){
            temp2=temp2.next;
        }
        temp1.next=list2;
        while(list2.next!=null){
            list2=list2.next;
        }
        list2.next=temp2;
        return list1;
    }
}