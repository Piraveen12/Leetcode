
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
      ListNode temp=head;
      ListNode current=head;
      while(n > 1 && temp !=null){
        temp=temp.next;
        n--;
      }
      if(temp.next==null){
        return current.next;
      }
      ListNode prev=null;
      while(temp.next!=null){
        prev=current;
        current=current.next;
        temp=temp.next;
      }
      if(current !=null && current.next !=null)
        prev.next=current.next;
      else{
        prev.next=null;
      }
      return  head;
    }
}