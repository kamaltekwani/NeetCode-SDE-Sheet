/*
 * Problem Link : https://leetcode.com/problems/permutations-ii/
 * Solution Link : https://leetcode.com/problems/permutations-ii/solutions/2031042/java-backtracking-explained-easy-understanding/
 *
 * Time Complexity : O(N * N!) [ https://leetcode.com/problems/permutations-ii/solutions/1527937/java-tc-o-n-n-sc-o-n-recursive-backtracking-iterative-solutions/ ]
 * Space Complexity : O(N) Recursion Stack and Temporary Stack
 */


class Q47_Permutations_II
{
    public void findPermutation(int nums[], boolean visited[],  List<Integer> list, List<List<Integer>> result)
    {
        if(list.size() == nums.length)
        {
            result.add(new ArrayList<Integer>(list));
            return;
        }

        for(int index=0 ; index<nums.length ; index++)
        {
            if(visited[index])
                continue;

            if(index == 0 || nums[index-1] != nums[index] || !visited[index-1])
            {
                visited[index] = true;
                list.add(nums[index]);
                findPermutation(nums, visited, list, result);
                visited[index] = false;
                list.remove(list.size()-1);
            }
        }
    }

    public List<List<Integer>> permuteUnique(int[] nums) 
    {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<Integer> list = new ArrayList<Integer>();

        Arrays.sort(nums);
        boolean visited[] = new boolean[nums.length];
        
        findPermutation(nums, visited, list, result);
        
        return result;
    }
}
