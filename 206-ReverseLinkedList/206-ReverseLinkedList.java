// Last updated: 8/31/2026, 9:59:06 AM
class Solution {
    public ListNode reverseList(ListNode head) {
    ListNode prev=null;
    ListNode curr=head;
    while(curr!=null){
        ListNode  temp=curr.next;    
        curr.next=prev;              
         prev = curr;                
        curr=temp;                   
    }
    return prev;
    }
}