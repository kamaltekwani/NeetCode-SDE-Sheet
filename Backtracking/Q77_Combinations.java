/*
 * Problem Link : https://leetcode.com/problems/combinations/
 * Solution Link : https://www.youtube.com/watch?v=fqrOsZdKegQ
 * 
 * Time Complexity : O(2 ^ N)
 * Space Complexity : at most O(2 ^ N) if k == N
 */

class Q77_Combinations 
{
    public void findCombination(int n, int start, int k, List<Integer> list, List<List<Integer>> result)
    {
        if(list.size() == k)
        {
            result.add(new ArrayList<Integer>(list));
            return;
        }

        for(int index=start ; index<=n ; index++)
        {
            list.add(index);
            findCombination(n, index+1, k, list, result);
            list.remove(list.size()-1);
        }
    }

    public List<List<Integer>> combine(int n, int k) 
    {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<Integer> list = new ArrayList<Integer>();
        findCombination(n, 1, k, list, result);
        return result;    
    }
}
