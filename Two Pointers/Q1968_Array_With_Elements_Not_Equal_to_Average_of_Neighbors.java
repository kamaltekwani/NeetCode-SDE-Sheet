/*
 * Problem Link : https://leetcode.com/problems/array-with-elements-not-equal-to-average-of-neighbors/
 * Solution Link : https://leetcode.com/problems/array-with-elements-not-equal-to-average-of-neighbors/solutions/1404417/java-greedy-easy-peasy/
 *
 * Time Complexity : O(N logn N)
 * Space Complexity : O(1)
 */

class Q1968_Array_With_Elements_Not_Equal_to_Average_of_Neighbors 
{
    public void swap(int nums[], int left, int right)
    {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }

    public int[] rearrangeArray(int[] nums) 
    {
        Arrays.sort(nums);

        for(int index=0 ; index<nums.length-1 ; index+=2)
            swap(nums, index, index+1);
        
        return nums;
    }
}
