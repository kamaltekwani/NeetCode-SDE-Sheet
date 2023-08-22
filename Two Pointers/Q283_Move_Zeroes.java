/*
 * Problem Link : https://leetcode.com/problems/move-zeroes/description/
 * Solution Link : https://leetcode.com/problems/move-zeroes/solutions/72000/1ms-java-solution/
 * 
 * Time Complexity : O(N)
 * Space Complexity : O(1)
 */


class Q283_Move_Zeroes 
{
    public void moveZeroes(int[] nums) 
    {
        int index = 0;

        for(int i=0 ; i<nums.length ; i++)
        {
            if(nums[i] != 0)
            {
                int temp = nums[i];
                nums[i] = nums[index];
                nums[index] = temp;
                index++;
            }
        }
    }
}
