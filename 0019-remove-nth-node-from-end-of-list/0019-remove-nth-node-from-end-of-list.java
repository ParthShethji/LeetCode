class Solution {

    private int count = 0;

    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) {
            return null;
        }
        ListNode node = removeNthFromEnd(head.next, n);
        count++; // Once the function calls start returning, start counting

        if (count == n) {
            return node;
        }
        head.next = node;
        return head;
    }
}