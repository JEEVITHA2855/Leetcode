class Solution {
    public void deleteNode(ListNode node) {
        if (node == null) {
            node=node.next;
        }
       node.val=node.next.val;
       node.next=node.next.next;
    }
}
