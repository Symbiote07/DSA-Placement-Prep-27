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
    public ListNode reverseList(ListNode head) {
        // Step 1: Initialize pointer positions
        ListNode prev = null;
        ListNode current = head;
        ListNode nextNode = null;

        // Step 2: Traverse through the list
        while (current != null) {
            nextNode = current.next; // Save the reference to the rest of the list
            current.next = prev;     // Reverse the current node's pointer link
            prev = current;          // Step the 'prev' pointer forward
            current = nextNode;      // Step the 'current' pointer forward
        }

        // 'prev' ends up pointing to the new head node of the reversed list
        return prev;
    }
}
