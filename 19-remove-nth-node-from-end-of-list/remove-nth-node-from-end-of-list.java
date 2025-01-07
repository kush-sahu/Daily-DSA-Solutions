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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null || head.next==null)return null;
        int size=0;
        ListNode temp=head;
        ListNode temp1=head;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
       int remove=size-n;
        if(remove==0){
           head=head.next;
           temp1.next=null;
        }else if(remove==size-1){
        
        int Nodecount=1;
        while(Nodecount!=remove){
            temp1=temp1.next;
             Nodecount++;
        }
        temp1.next=null;
      }else{
       int Nodecount=1;
        while(Nodecount!=remove){
            temp1=temp1.next;
             Nodecount++;
        }
       ListNode temp2=temp1.next;
       ListNode temp3=temp2.next;
        temp1.next=temp3;
        temp2.next=null;
       }
        return head;
       }
      
    }
