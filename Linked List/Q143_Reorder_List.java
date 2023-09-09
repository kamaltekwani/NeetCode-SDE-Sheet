/**
 * 
 * Problem Link : https://leetcode.com/problems/reorder-list/
 * Solution Link : 
 * 
 * Time Complexity : 
 * Space Complexity : 
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

class Q143_Reorder_List 
{
    public ListNode reverse(ListNode node)
    {
        ListNode previous = null;
        ListNode current = node;

        while(current != null)
        {
            ListNode next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }

        return previous;
    }

    public void reorderList(ListNode head) 
    {
        if(head == null || head.next == null)
            return;

        ListNode previous = null;
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null)
        {
            previous = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        previous.next = null;

        ListNode nodeA = head;
        ListNode nodeB = reverse(slow);

        ListNode current = new ListNode(-1);
        
        while(nodeA != null || nodeB != null)
        {
            if(nodeA != null)
            {
                current.next = nodeA;
                current = current.next;
                nodeA = nodeA.next;
            }

            if(nodeB != null)
            {
                current.next = nodeB;
                current = current.next;
                nodeB = nodeB.next;
            }
        }    
    }
}
