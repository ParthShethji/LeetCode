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
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || k == 0) {
            return head;
        }

        // Find the length of the linked list
        int count = 1;
        ListNode tail = head;
        while (tail.next != null) {
            count++;
            tail = tail.next;
        }

        // Adjust k to be within the length of the linked list
        k = k % count;
        if (k == 0) {
            return head; // No rotation needed
        }

        // Find the new tail (the node at position count - k)
        ListNode newTail = head;
        for (int i = 1; i < count - k; i++) {
            newTail = newTail.next;
        }

        // Rotate the list
        ListNode newHead = newTail.next;
        newTail.next = null;
        tail.next = head;

        return newHead;
    }
}
