/**
 * Problem Link : https://leetcode.com/problems/reverse-nodes-in-k-group/
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

class Q25_Reverse_Nodes_in_k_Group 
{
    public ListNode reverseKGroup(ListNode head, int k) 
    {
        if(head == null || head.next == null)
            return head;

        ListNode current = head;
        ListNode tempNode = head;
        ListNode previous = null;
        ListNode next = null;

        int tempCount = 0;
        int count = 0;

        while(tempNode != null && tempCount < k)
        {
            tempNode = tempNode.next;
            tempCount++;
        }

        if(tempCount<k)
            return head;

        while(current != null && count < k)
        {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
            count++;
        }

        if(count < k)
            return head;

        if(next != null)
            head.next = reverseKGroup(next, k);

        return previous;
    }
}
