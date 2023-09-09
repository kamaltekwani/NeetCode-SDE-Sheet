/**
 * Problem Link :  https://leetcode.com/problems/remove-nth-node-from-end-of-list/
 * Solution Link : https://leetcode.com/problems/remove-nth-node-from-end-of-list/solutions/1164542/js-python-java-c-easy-two-pointer-solution-w-explanation/
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
class Q19_Remove_Nth_Node_From_End_of_List 
{
    public ListNode removeNthFromEnd(ListNode head, int n) 
    {
        ListNode slow = head;
        ListNode fast = head;

        for(int i=0 ; i<n ; i++)
            fast = fast.next;

        if(fast == null)
            return head.next;

        while(fast.next != null)
        {
            slow = slow.next;
            fast = fast.next;
        }

        slow.next = slow.next.next;

        return head;
    }
}
