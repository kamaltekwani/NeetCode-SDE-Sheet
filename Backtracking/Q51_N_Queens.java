/*
 * Problem Link : https://leetcode.com/problems/n-queens/
 * Solution Link : https://www.youtube.com/watch?v=jJMWhGKq3SM
 *
 * Time Complexity : 
 * Space Complexity : 
 */

class Solution 
{
    public boolean isQueensPlaceValid(List<int []> queens, int row, int column)
    {
        for(int queen[] : queens)
        {
            int dx = Math.abs(queen[0] - row);
            int dy = Math.abs(queen[1] - column);

            if(dx == 0 || dy == 0 || dx == dy)
                return false;
        }

        return true;
    }

    public void placeQueens(char board[][], int row, List<int []> queens, List<List<String>> result)
    {
        if(queens.size() == board.length)
        {
            List<String> temp = new ArrayList<String>();
            for(char tmp[] : board)
                temp.add(new String(tmp));
            result.add(temp);
        }

        for(int column=0 ; column<board.length ; column++)
        {
            if(isQueensPlaceValid(queens, row, column))
            {
                board[row][column] = 'Q';
                queens.add(new int[]{row, column});
                placeQueens(board, row+1, queens, result);
                queens.remove(queens.size()-1);
                board[row][column] = '.';
            }
        }
    }

    public List<List<String>> solveNQueens(int n) 
    {
        List<List<String>> result = new ArrayList<List<String>>();
        List<int []> queens = new ArrayList<int []>();

        char board[][] = new char[n][n];

        for(int i=0 ; i<n ; i++)
            for(int j=0 ; j<n ; j++)
                board[i][j] = '.';

        placeQueens(board, 0, queens, result);
        return result;
    }
}
