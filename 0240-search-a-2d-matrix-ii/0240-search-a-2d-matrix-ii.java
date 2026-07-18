class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
         int r=matrix.length-1;
        int c=matrix[0].length-1;
        int i=0;
        while(i<=r && c>=0){
            if(matrix[i][c]==target){
                return true;
            }
            else if(matrix[i][c]>target){
                c--;
            }
            else{
                i++;
            }
        }
        return false;

    }
}