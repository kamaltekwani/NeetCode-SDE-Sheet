/*
 * Problem Link : https://leetcode.com/problems/valid-palindrome-ii/description/
 * Solution Link : https://leetcode.com/problems/valid-palindrome-ii/solutions/1245374/c-java-easy-single-method-two-pointers-efficient-explained/
 *
 * Time Complexity : O(N)
 * Space Complexity : O(1)
 */

class Q680_Valid_Palindrome_II
{
    public boolean checkPalindrome(String s, int left, int right)
    {
        while(left < right)
        {
            if(s.charAt(left) != s.charAt(right))
                return false;
            left++;
            right--;
        }

        return true;
    }

    public boolean validPalindrome(String s) 
    {
        int left = 0;
        int right = s.length()-1;

        while(left < right)
        {
            if(s.charAt(left) != s.charAt(right))
                return checkPalindrome(s, left+1, right) || checkPalindrome(s, left, right-1);

            left++;
            right--;
        }

        return true;
    }

    
}
