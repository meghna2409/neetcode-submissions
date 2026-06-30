class Solution {
    public void rotate(int[][] matrix) {
        System.out.println(java.util.Arrays.deepToString(matrix));
        
        int l = 0;
        int r = matrix.length - 1;
        
        while (l < r) {
            for (int i = 0; i < r - l; i++) {
                // l = 0
                // r = 3
                int top = l; // top = 0
                int bottom = r; // bottom = 3
                // m[0][1]
                int topLeft = matrix[top][l + i]; 
                // m[0][1] == m[2][0]
                matrix[top][l + i] = matrix[bottom - i][l]; 
                // m[2][0] == m[3][2]
                matrix[bottom - i][l] = matrix[bottom][r - i];
                // m[3][2] == m[1][3]
                matrix[bottom][r - i] = matrix[top + i][r];
                matrix[top + i][r] = topLeft;
            }
            l++;
            r--;
        }
        System.out.println(java.util.Arrays.deepToString(matrix));
    }
}
