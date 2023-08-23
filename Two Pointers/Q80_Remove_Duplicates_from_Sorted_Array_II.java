/*
 * Problem Link : https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/
 * Solution Link : https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/solutions/968051/remove-duplicates-o-n-time-o-1-space-complexity/
 *
 *
 * Time Complexity : O(N) 
 * Space Complexity : O(1)
 */

class Q80_Remove_Duplicates_from_Sorted_Array_II
{
    public int removeDuplicates(int[] nums) 
    {
        int index=2;

        for(int i=2 ; i<nums.length ; i++)
            if(nums[i] != nums[index-2])
                nums[index++] = nums[i];
        
        return index;
    }
}
