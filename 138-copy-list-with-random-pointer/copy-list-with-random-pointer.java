/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
       HashMap<Node,Node>hm=new HashMap<>();
       Node curr=head;

       while(curr!=null){
        hm.put(curr,new Node(curr.val));
        curr=curr.next;
       }
       curr=head;

       while(curr!=null){
        Node newNode=hm.get(curr);
        newNode.next=hm.get(curr.next);
        newNode.random=hm.get(curr.random);
        curr=curr.next;
       }
       return hm.get(head);
    }
}