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
    public int pairSum(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;

        while(fast!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode prev=null;
        while(slow!=null && slow.next!=null){
            ListNode f=slow.next;
            slow.next=prev;
            prev=slow;
            slow=f;
        }
        slow.next=prev;

        int ans=0;
        ListNode p1=head;
        while(slow!=null ){
         ans=Math.max(slow.val+p1.val,ans);
         slow=slow.next;
         p1=p1.next;
        }
        return ans;
                                                                              
    }
}