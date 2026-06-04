class Solution {
    public int[][] reshapeMatrix(int[][] mat, int r, int c) {
        int m=mat.length;
        int n=mat[0].length;
        if(m*n!=r*c){
            return mat;
        }
        int newMat[][] = new int[r][c];
        int row=0;
        int cols=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                newMat[row][cols++] = mat[i][j];
                if(cols==c){
                    cols=0;
                    row++;
                }
            }
        }
        return newMat;
    }
}
