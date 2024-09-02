/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashMap<ListNode, Integer> map = new HashMap<>();
        ListNode dummy1 = headA, dummy2 = headB;
        while(dummy1!=null){
            map.put(dummy1, 1);
            dummy1 = dummy1.next;
        }
        
        while(dummy2!=null){
            if(map.containsKey(dummy2)){
                return dummy2;
            }
            dummy2=dummy2.next;
        }
        return null;
    }}