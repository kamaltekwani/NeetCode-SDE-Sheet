/*
 * Problem Link : https://leetcode.com/problems/longest-consecutive-sequence/
 * Solution Link : https://leetcode.com/problems/longest-consecutive-sequence/solutions/41130/another-accepted-java-o-n-solution/
 *
 * Time Complexity : O(N)
 * Space Complexity : O(N)
 */

class Q128_Longest_Consecutive_Sequence 
{
    public int longestConsecutive(int[] nums) 
    {
        Set<Integer> set = new HashSet<Integer>();
        int length = 0;

        for(int value : nums)
            set.add(value);

        for(int value : nums)
        {
            int left = value;
            int right = value;
            int count = 1;

            while(set.contains(left-1))
            {
                set.remove(left);
                left = left - 1;
                count++;
            }

            while(set.contains(right+1))
            {
                set.remove(right);
                right = right + 1;
                count++;
            }

            length = Math.max(count, length);
        }

        return length;
    }
}
