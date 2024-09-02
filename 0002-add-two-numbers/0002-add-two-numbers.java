class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode ans = dummy;
        int prevCarry = 0;

        while (l1 != null || l2 != null) {
            int sum = prevCarry;
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            ans.next = new ListNode(sum % 10);
            prevCarry = sum / 10;
            ans = ans.next;
        }

        if (prevCarry > 0) {
            ans.next = new ListNode(prevCarry);
        }

        return dummy.next;
    }
}
