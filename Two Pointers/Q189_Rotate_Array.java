/*
 * Problem Link : https://leetcode.com/problems/rotate-array/description/
 * Solution Link : https://leetcode.com/problems/rotate-array/solutions/54250/easy-to-read-java-solution/
 *
 * Time Complexity : O(N)
 * Space Complexity : O(1)
 */

class Q189_Rotate_Array 
{
    public void reverse(int nums[], int left, int right)
    {
        while(left < right)
        {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }

    public void rotate(int[] nums, int k) 
    {
        k = k % nums.length;
        reverse(nums, 0, nums.length-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, nums.length-1);    
    }
}

