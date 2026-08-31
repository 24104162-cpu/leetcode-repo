// Last updated: 8/31/2026, 9:58:48 AM
class Solution {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}