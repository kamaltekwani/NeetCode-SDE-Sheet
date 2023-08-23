/*
 * Problem Link : https://leetcode.com/problems/merge-strings-alternately/
 * Solution Link : https://leetcode.com/problems/merge-strings-alternately/solutions/3429116/easy-solutions-in-java-python-and-c-look-at-once-with-exaplanation/
 *
 * Time Complexity : O(N)
 * Space Complexity : O(1)
 */

class Q1768_Merge_Strings_Alternately 
{
    public String mergeAlternately(String word1, String word2) 
    {
        StringBuilder sb = new StringBuilder();

        int indexA = 0;
        int indexB = 0;

        int aLength = word1.length();
        int bLength = word2.length();

        while(indexA < aLength || indexB < bLength)
        {
            if(indexA < aLength)
                sb.append(word1.charAt(indexA++));

            if(indexB < bLength)
                sb.append(word2.charAt(indexB++));
        }

        return sb.toString();
    }
}
