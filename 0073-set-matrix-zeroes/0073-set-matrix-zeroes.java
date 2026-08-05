class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        int[] rows = new int[m];
        int[] cols = new int[n];

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(matrix[i][j] == 0) {
                    rows[i] = 1;
                    cols[j] = 1;
                }
            }
        }

        // marks rows to be zero
        for(int i = 0; i < m; i++) {
            if(rows[i] == 1) {
                for(int col = 0; col < n; col++) {
                    matrix[i][col] = 0;
                }
            }
        } 

        // marks cols to be zero
        for(int j = 0; j < n; j++) {
            if(cols[j] == 1) {
                for(int row = 0; row < m; row++) {
                    matrix[row][j] = 0;
                }
            }
        }
    }
}