/*
 * Problem Link : https://leetcode.com/problems/evaluate-reverse-polish-notation/
 * Solution Link : https://leetcode.com/problems/evaluate-reverse-polish-notation/solutions/1229403/js-python-java-c-easy-stack-solution-w-explanation/
 *
 * Time Complexity : O(N)
 * Space Complexity : O(N)
 */

class Q150_Evaluate_Reverse_Polish_Notation 
{
    public boolean isOperator(String s)
    {
        return s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/");
    }


    public int evalRPN(String[] tokens) 
    {
        Stack<Integer> stack = new Stack<Integer>();

        for(String token : tokens)
        {
            if(isOperator(token))
            {
                int first = stack.pop();
                int second = stack.pop();
                int result = 0;

                if(token.equals("+"))
                    result = first + second;
                else if(token.equals("-"))
                    result = second - first;
                else if(token.equals("*"))
                    result = first * second;
                else if(token.equals("/"))
                    result = second / first;

                stack.push(result);
            }
            else
                stack.push(Integer.parseInt(token));
        }

        return stack.peek();
    }
}
