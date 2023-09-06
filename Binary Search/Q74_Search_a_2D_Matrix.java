/*
 * Problem Link : https://leetcode.com/problems/search-a-2d-matrix/
 * Solution Link : https://leetcode.com/problems/search-a-2d-matrix/solutions/26292/java-clear-solution/
 *
 * Time Complexity : O(log M + log N)
 * Space Complexity : O(1)
 */

class Q74_Search_a_2D_Matrix 
{
    public boolean searchMatrix(int[][] matrix, int target) 
    {
        int row = 0;
        int column = matrix[0].length-1;

        while(row<matrix.length && column>= 0)
        {
            if(matrix[row][column] == target)
                return true;
            else if(matrix[row][column] < target)
                row++;
            else
                column--;
        }
        return false;
    }
}
