/*
 * Problem Link : https://leetcode.com/problems/generate-parentheses/
 * Solution Link : https://leetcode.com/problems/generate-parentheses/solutions/10100/easy-to-understand-java-backtracking-solution/
 * 
 * Time Complexity : O( 4^N / SQRT(N) )
 * Space Complexity : O(N)
 * where N is the input number of pairs of parenthesis
 */

class Q22_Generate_Parentheses 
{
    public void generate(String s, int open, int close, int n, List<String> result)
    {
        if(s.length() == 2*n)
        {
            result.add(s);
            return;
        }

        if(open < n)
            generate(s+"(", open+1, close, n, result);

        if(close < open)
            generate(s+")", open, close+1, n, result);
    }

    public List<String> generateParenthesis(int n) 
    {
        List<String> result = new ArrayList<String>();
        generate("(", 1, 0, n, result);
        return result;    
    }
}
