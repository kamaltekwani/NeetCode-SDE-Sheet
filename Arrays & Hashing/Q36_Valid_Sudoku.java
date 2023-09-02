/*
 * Problem Link : https://leetcode.com/problems/valid-sudoku/d
 * Solution Link : https://leetcode.com/problems/valid-sudoku/solutions/15472/short-simple-java-using-strings/
 *
 * Time Complexity : O(N * N)
 * Space Complexity : O(N * N)
 */

class Q36_Valid_Sudoku 
{
    public boolean isValidSudoku(char[][] board) 
    {
        Set<String> set = new HashSet<String>();

        for(int row=0 ; row<9 ; row++)
            for(int column=0 ; column<9 ; column++)
                if(board[row][column] != '.')
                {
                    String value = "("+ board[row][column] +")";
                    if(!set.add(row + value) || !set.add(value + column) || !set.add((row/3) + value + (column/3)))
                        return false;
                }
            
        return true;
    }
}
