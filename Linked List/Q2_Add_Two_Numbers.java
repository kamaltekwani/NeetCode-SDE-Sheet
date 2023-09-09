/**
 * Problem Link : https://leetcode.com/problems/add-two-numbers/description/
 * Solution Link : https://leetcode.com/problems/add-two-numbers/solutions/3675747/beats-100-c-java-python-beginner-friendly/
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

class Q2_Add_Two_Numbers 
{
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) 
    {
        int carry = 0;

        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;

        while(l1 != null || l2 != null)
        {
            int sum = carry;

            sum += (l1 == null) ? 0 : l1.val;

            sum += (l2 == null) ? 0 : l2.val;

            current.next = new ListNode(sum % 10);
            carry = sum / 10;

            current = current.next;

            l1 = l1 == null ? null : l1.next;
            l2 = l2 == null ? null : l2.next;
        }

        if(carry != 0)
            current.next = new ListNode(carry);
        
        return dummy.next;
    }
}
