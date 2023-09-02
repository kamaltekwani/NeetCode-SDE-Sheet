/*
 * Problem Link : https://leetcode.com/problems/longest-repeating-character-replacement/
 * Solution Link : https://leetcode.com/problems/longest-repeating-character-replacement/solutions/591288/java-o-n-solution-using-sliding-window-with-explanation/
 *
 * Time Complexity : O(N)
 * Space Complexity : O(1)
 */

class Q424_Longest_Repeating_Character_Replacement 
{
    public int characterReplacement(String s, int k) 
    {
        int alphabet[] = new int[26];
        int left = 0;
        
        int maxCount = 0;
        int length = 0;

        for(int right=0 ; right<s.length() ; right++)
        {
            alphabet[s.charAt(right)-'A']++;
            maxCount = Math.max(maxCount, alphabet[s.charAt(right)-'A']);

            if(right - left + 1 - maxCount > k)
            {
                alphabet[s.charAt(left)-'A']--;
                left++;
            }

            length = Math.max(length, right - left + 1);
        }
        
        return length;
    }
}
