/*
 * Problem Link : https://leetcode.com/problems/subsets-ii/
 * Solution Link : https://leetcode.com/problems/subsets-ii/solutions/169226/java-two-way-of-recursive-thinking/
 *
 * Time Complexity : O( N * 2^N )
 * Space Complexity : O( Unique Numbers )
 */

class Q90_Subsets_II 
{
    public void findSubsetsWithDuplicate(int nums[], int start, List<Integer> list, List<List<Integer>> result)
    {
        result.add(new ArrayList<Integer>(list));

        for(int index=start ; index<nums.length ; index++)
        {
            if(index==start || nums[index-1] != nums[index])
            {
                list.add(nums[index]);
                findSubsetsWithDuplicate(nums, index+1, list, result);
                list.remove(list.size()-1);
            }
        }
    }

    public List<List<Integer>> subsetsWithDup(int[] nums) 
    {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<Integer> list = new ArrayList<Integer>();
        findSubsetsWithDuplicate(nums, 0, list, result);
        return result; 
    }
}
