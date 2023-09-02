/*
 * Problem Link : https://leetcode.com/problems/minimum-window-substring/
 * Solution Link : https://leetcode.com/problems/minimum-window-substring/solutions/1496754/java-tc-o-s-t-sc-o-t-space-optimized-sliding-window-using-two-pointers/
 * 
 * Time Complexity : O(S + T)
 * Space Complexity : O(T)
 */


class Q76_Minimum_Window_Substring 
{
  public String minWindow(String s, String t) 
	{
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		
		for(char c : t.toCharArray())
			map.put(c, map.getOrDefault(c, 0)+1);
		
		int start = 0;
		int end = 0;
		
		int minStart = 0;
		int minLength = Integer.MAX_VALUE;
		
		int sLength = s.length();
		int tLength = t.length();
		
		int count = 0;
		
		while(end < sLength)
		{
			if(map.containsKey(s.charAt(end)))
			{
				map.put(s.charAt(end), map.get(s.charAt(end))-1);
				if(map.get(s.charAt(end)) >= 0)
					count++;
			}
			
			while(count == tLength)
			{
				if(minLength > end - start + 1)
				{
					minLength = end - start + 1;
					minStart = start;
				}
				
				if(map.containsKey(s.charAt(start)))
				{
					map.put(s.charAt(start), map.get(s.charAt(start))+1);
					if(map.get(s.charAt(start)) > 0)
							count--;
				}
				
				start++;
			}
			
			end++;
		}
		
		if(minLength > sLength)
			return "";
		
		return s.substring(minStart, minStart+minLength);
	}
}
