/*
 * Problem Link : https://leetcode.com/problems/contains-duplicate/
 * Solution Link : https://leetcode.com/problems/contains-duplicate/solutions/3163705/java-best-solution-3-ways/
 *
 * Time Complexity : O(N)
 * Space Complexity : O(N)
 */

class Solution 
{
    public boolean containsDuplicate(int[] nums) 
    {
        Set<Integer> set = new HashSet<Integer>();
        for(int value : nums)
            if(!set.add(value))
                return true;
        return false;
    }
}



