/*
 * Problem Link : https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 * Solution Link : https://leetcode.com/problems/remove-duplicates-from-sorted-array/solutions/3496619/simplest-4-line-sol-with-proper-explanation/
 *
 * Time Complexity : O(N)
 * Space Complexity : O(1)
 */


class Q26_Remove_Duplicates_from_Sorted_Array 
{
    public int removeDuplicates(int[] nums) 
    {
        int index = 0;

        for(int i=1 ; i<nums.length ; i++)
            if(nums[index] != nums[i])
            {
                index++;
                nums[index] = nums[i];
            }    
        
        return index+1;
    }
}
