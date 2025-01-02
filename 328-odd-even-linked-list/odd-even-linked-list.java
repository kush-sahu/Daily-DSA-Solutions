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
    public ListNode oddEvenList(ListNode head) {
        if(head==null || head.next==null || head.next.next==null)return head;
        ListNode slow=head;
        ListNode fast=head.next;
        ListNode head2=head.next;
       
        while(fast!=null && fast.next!=null ){
            slow.next=fast.next;
            slow=fast.next;
            fast.next=slow.next;
            fast=slow.next;
        }
      slow.next=head2;
      //  p1.next=head2;
        return head;
    }
}