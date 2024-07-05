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
import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        // Define a large initial value for minDistance and create a list to store critical point indices.
        int minDistance = Integer.MAX_VALUE;
        List<Integer> criticalPoints = new ArrayList<>();
        
        ListNode prev = head;
        ListNode curr = head.next;
        int index = 1;
        
        while (curr != null && curr.next != null) {
            ListNode next = curr.next;
            if ((curr.val < prev.val && curr.val < next.val) || (curr.val > prev.val && curr.val > next.val)) {
                criticalPoints.add(index);
            }
            prev = curr;
            curr = next;
            index++;
        }
        
        if (criticalPoints.size() < 2) {
            return new int[]{-1, -1};
        }
        
        for (int i = 1; i < criticalPoints.size(); i++) {
            minDistance = Math.min(minDistance, criticalPoints.get(i) - criticalPoints.get(i - 1));
        }
        
        int maxDistance = criticalPoints.get(criticalPoints.size() - 1) - criticalPoints.get(0);
        
        return new int[]{minDistance, maxDistance};
    }
}
