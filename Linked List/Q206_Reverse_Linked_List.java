/**
 *
 * Problem Link : https://leetcode.com/problems/reverse-linked-list/
 * Solution Link : https://leetcode.com/problems/reverse-linked-list/solutions/2682085/java-0ms-100-easy-understanding/
 *
 * Time Complexity : O(N)
 * Space Complexity : O(1)
 *
 *
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Q206_Reverse_Linked_List 
{
    public ListNode reverseList(ListNode head) 
    {
        ListNode previous = null;
        ListNode current = head;

        while(current != null)
        {
            ListNode next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        
        return previous;
    }
}
