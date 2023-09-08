/**
 *
 * Problem Link : https://leetcode.com/problems/merge-two-sorted-lists/
 * Solution Link : https://leetcode.com/problems/merge-two-sorted-lists/solutions/3177193/simple-java-runtime-1-ms-beats-100/
 *
 * Time Complexity : 
 * Space Complexity : 
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

class Q21_Merge_Two_Sorted_Lists 
{
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) 
    {
        if(list1 == null && list2 == null)
            return null;

        if(list1 == null)
            return list2;

        if(list2 == null)
            return list1;

        if(list1.val < list2.val)
        {
            list1.next = mergeTwoLists(list1.next, list2);
            return list1;
        }
        else
        {
            list2.next = mergeTwoLists(list1, list2.next);
            return list2;
        }

    }
}
