/*
 * Problem Link : https://leetcode.com/problems/top-k-frequent-elements/
 * Solution Link : https://leetcode.com/problems/top-k-frequent-elements/solutions/81635/3-java-solution-using-array-maxheap-treemap/
 *
 * Time Complexity : O(N)
 * Space Complexity : O(N)
 */


class Q347_Top_K_Frequent_Elements 
{
    public int[] topKFrequent(int[] nums, int k) 
    {
        PriorityQueue<Map.Entry<Integer,Integer>> priorityQueue = new PriorityQueue<Map.Entry<Integer,Integer>>((a,b) -> b.getValue() - a.getValue());

        Map<Integer,Integer> map = new HashMap<Integer,Integer>();

        for(int value : nums)
            map.put(value, map.getOrDefault(value, 0) + 1);

        for(Map.Entry<Integer,Integer> entry : map.entrySet())
            priorityQueue.offer(entry);

        int index = 0;
        int result[] = new int[k];

        while(index<k)
        {
            Map.Entry<Integer,Integer> entry = priorityQueue.poll();
            result[index++] = entry.getKey();
        }

        return result;
    }
}
