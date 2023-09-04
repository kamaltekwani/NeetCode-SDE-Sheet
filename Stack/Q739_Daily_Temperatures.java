/*
 * Problem Link : https://leetcode.com/problems/daily-temperatures/
 * Solution Link : https://www.youtube.com/watch?v=bMrcBdwRh2U
 *
 * Time Complexity : O(N)
 * Space Complexity : O(N)
 */

class Q739_Daily_Temperatures 
{
    public int[] dailyTemperatures(int[] temperatures) 
    {
        Stack<Integer> stack = new Stack<Integer>();
        int result[] = new int[temperatures.length];
        for(int index=0 ; index<temperatures.length ; index++)
        {
            while(!stack.isEmpty() && temperatures[index] > temperatures[stack.peek()])
            {
                result[stack.peek()] = index - stack.peek();
                stack.pop();
            }
            stack.push(index);
        }
        
        return result;
    }
}
