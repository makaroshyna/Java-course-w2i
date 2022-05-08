public class Task88 {

     public Task88() {
     }

     public int[][] run(int[][] matrix, int m) {

         for (int i = 1; i < m; i++) {
             for (int j = i, k = 0; j < m && k < m; j++, k++) {
                 matrix[j][k] = 0;
             }
         }

         return matrix;
     }
}
