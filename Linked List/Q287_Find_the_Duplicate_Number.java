/*
 * Problem Link : https://leetcode.com/problems/find-the-duplicate-number/
 * Solution Link : 
 *
 * Time Complexity : O(N)
 * Space Complexity : O(1)
 */


class Q287_Find_the_Duplicate_Number 
{
    public int findDuplicate(int[] nums) 
    {
        int slow = 0;
        int fast = 0;
        int check = 0;

        while(true)
        {
            slow = nums[slow];
            fast = nums[nums[fast]];
            if(slow == fast)
                break;
        }   

        while(true)
        {
            slow = nums[slow];
            check = nums[check];
            if(slow == check)
                break;
        }

        return slow;
    }
}
