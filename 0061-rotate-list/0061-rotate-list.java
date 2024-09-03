class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head;
        }

        // Count the number of nodes in the list
        ListNode temp = head;
        int length = 1;  // Start from 1 since we're already at head
        while (temp.next != null) {
            length++;
            temp = temp.next;
        }

        // Make the list circular
        temp.next = head;

        // Calculate the actual number of rotations needed
        k = k % length;
        int stepsToNewHead = length - k;
        temp = head;
        for (int i = 0; i < stepsToNewHead - 1; i++) {
            temp = temp.next;
        }

        // Break the circle and set the new head
        ListNode newHead = temp.next;
        temp.next = null;

        return newHead;
    }
}
