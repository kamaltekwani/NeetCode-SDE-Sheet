/*
 * Problem Link : https://leetcode.com/problems/minimum-difference-between-highest-and-lowest-of-k-scores/
 * Solution Link : https://leetcode.com/problems/minimum-difference-between-highest-and-lowest-of-k-scores/solutions/3688672/java-solution-using-sliding-window/
 * Time Complexity : O(N log N)
 * Space Complexity : O(1)
 *
 */

class Q1984_Minimum_Difference_Between_Highest_and_Lowest_of_K_Scores 
{
    public int minimumDifference(int[] nums, int k) 
    {
        if(k == 0)
            return 1;

        Arrays.sort(nums);

        int left = 0;
        int right = k - 1;
        int result = Integer.MAX_VALUE;

        while(right < nums.length)
            result = Math.min(result, nums[right++] - nums[left++]);

        return result;
    }
}
