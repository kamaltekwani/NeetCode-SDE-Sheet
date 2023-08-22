/*
 * Problem Link : https://leetcode.com/problems/reverse-string/
 * Solution Link : https://leetcode.com/problems/reverse-string/solutions/1901756/java-c-3-way-s-visual-solution/
 *
 * Time Complexity : O(N)
 * Space Complexity : O(1)
 */

class Q344_Reverse_String 
{
    public void reverseString(char[] s) 
    {
        int left = 0;
        int right = s.length-1;

        while(left < right)
        {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            left++;
            right--;
        }   
    }
}
