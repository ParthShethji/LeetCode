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
    public ListNode middleNode(ListNode head) {
        if(head==null || head.next==null)   return head;
        int count =1;
        ListNode cur = head;
        while(cur.next != null){
            count++;
            cur = cur.next;
        }
        count = (count/2);
        cur = head;
        while(count !=0){
            count--;
            cur = cur.next;
        }
        return cur;
    }
}