/*
 * Problem Link : https://leetcode.com/problems/valid-anagram/
 * Solution Link : https://leetcode.com/problems/valid-anagram/solutions/66484/accepted-java-o-n-solution-in-5-lines/
 *
 * Time Complexity : O(N)
 * Space Complexity : O(1)
 */

class Q242_Valid_Anagram 
{
    public boolean isAnagram(String s, String t) 
    {
        int alphabet[] = new int[26];

        for(char c : s.toCharArray())
            alphabet[c-'a']++;

        for(char c : t.toCharArray())
            alphabet[c-'a']--;

        for(int i : alphabet)
            if(i != 0)
                return false;

        return true;
    }
}
