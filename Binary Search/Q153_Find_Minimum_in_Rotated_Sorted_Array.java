/*
 * Problem Link : https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/
 * Solution Link : https://www.youtube.com/watch?v=nhEMDKMB44g&pp=ygUpMTUzLiBGaW5kIE1pbmltdW0gaW4gUm90YXRlZCBTb3J0ZWQgQXJyYXk%3D
 *
 * Time Complexity : O(log n)
 * Space Complexity : O(1)
 */


class Q153_Find_Minimum_in_Rotated_Sorted_Array 
{
    public int findMin(int[] nums) 
    {
        int left = 0;
        int right = nums.length - 1;

        while(left < right)
        {
            int mid = left + (right - left)/2;
            
            if(nums[right] >= nums[mid])
                right = mid;
            else
                left = mid+1;
        }

        return nums[left];
    }
}
