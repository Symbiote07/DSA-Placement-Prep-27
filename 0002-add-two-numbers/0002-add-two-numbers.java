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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // Create a dummy head node to simplify the list building process
        ListNode dummyHead = new ListNode(0);
        ListNode current = dummyHead;
        int carry = 0;

        // Loop as long as there is data to process in l1, l2, or a remaining carry
        while (l1 != null || l2 != null || carry != 0) {
            int sum = carry; // Start with the carry value from the previous step

            // Add value from l1 if it exists
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next; // Move to the next node
            }

            // Add value from l2 if it exists
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next; // Move to the next node
            }

            // Calculate the new carry (either 0 or 1)
            carry = sum / 10;

            // Create a new node with the single-digit remainder and link it
            current.next = new ListNode(sum % 10);
            current = current.next; // Move the pointer forward
        }

        // The actual result starts after the placeholder dummy node
        return dummyHead.next;
    }
}
