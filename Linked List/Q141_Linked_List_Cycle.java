/**
 * Problem Link : https://leetcode.com/problems/linked-list-cycle/
 * Solution Link : https://leetcode.com/problems/linked-list-cycle/solutions/3999179/video-solution-with-two-pointers-and-a-bonus-video-python-javascript-java-c/
 *
 * Time Complexity : 
 * Space Complexity : 
 *
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

public class Q141_Linked_List_Cycle 
{
    public boolean hasCycle(ListNode head) 
    {
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast)
                return true;
        }

        return false;
    }
}
