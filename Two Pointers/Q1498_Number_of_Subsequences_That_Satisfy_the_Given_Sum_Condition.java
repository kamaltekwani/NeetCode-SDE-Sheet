/*
 * Problem Link : https://leetcode.com/problems/number-of-subsequences-that-satisfy-the-given-sum-condition/
 * Solution Link : https://leetcode.com/problems/number-of-subsequences-that-satisfy-the-given-sum-condition/solutions/709227/java-c-python-two-sum/
 *
 * Time Complexity : O(N log N)
 * Space Complexity : O(N)
 */

class Q1498_Number_of_Subsequences_That_Satisfy_the_Given_Sum_Condition 
{
    public int numSubseq(int[] nums, int target) 
    {
        int left = 0;
        int right = nums.length-1;
        int count = 0;

        Arrays.sort(nums);

        int power[] = new int[nums.length];

        int mod = 1_000_000_007;

        power[0] = 1;
        for(int index=1 ; index<nums.length ; index++)
            power[index] = (2 * power[index-1]) % mod;

        while(left <= right)
        {
            if(nums[left] + nums[right] <= target)
            {
                count = (count + power[right - left]) % mod;
                left++;
            }
            else
                right--;
        }

        return count;
    }
}
