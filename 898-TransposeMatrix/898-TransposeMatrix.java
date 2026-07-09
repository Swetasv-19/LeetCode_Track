// Last updated: 7/9/2026, 10:15:39 AM
class Solution {
    public int[][] transpose(int[][] matrix) {
        int[][] res = new int[matrix[0].length][matrix.length];

        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[0].length; c++) {
                res[c][r] = matrix[r][c];
            }
        }

        return res;        
    }
}