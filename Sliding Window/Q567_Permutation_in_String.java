/*
 * Problem Link : https://leetcode.com/problems/permutation-in-string/
 * Solution Link : https://www.youtube.com/watch?v=XFh_AoEdOTw
 *
 * Time Complexity : O(N)
 * Space Complexity : O(1)
 *
 */

class Q567_Permutation_in_String 
{
    public boolean checkInclusion(String s1, String s2) 
    {
        if(s1.length() > s2.length())
            return false;

        int alphabetA[] = new int[26];
        int alphabetB[] = new int[26];

        for(int index=0 ; index<s1.length() ; index++)
        {
            alphabetA[s1.charAt(index) - 'a']++;
            alphabetB[s2.charAt(index) - 'a']++;
        }
        
        if(Arrays.equals(alphabetA, alphabetB))
            return true;

        int left = 0;
        int right = s1.length();

        while(right < s2.length())
        {
            alphabetB[s2.charAt(left)-'a']--;
            alphabetB[s2.charAt(right)-'a']++;

            if(Arrays.equals(alphabetA, alphabetB))
                return true;
            
            left++;
            right++;
        }
        return false;
    }
}
