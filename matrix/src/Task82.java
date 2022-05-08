public class Task82 {

    public Task82() {
    }

    public int[] run(int[][] matrix, int m) {

        int diagonalNum = (2 * m) - 1;
        int[] sum = new int[diagonalNum];
        int sumId = 0;

        for (int i = m - 1; i >= 0; i--) {

            for (int j = 0, k = i; j < m && k < m; j++, k++) {
                sum[sumId] = sum[sumId] + matrix[j][k];
            }
            sumId++;
        }

        for (int i = 1; i < m; i++) {

            for (int j = i, k = 0; j < m && k < m; j++, k++) {
                sum[sumId] = sum[sumId] + matrix[j][k];
            }
            sumId++;
        }

        return sum;
    }
}

/*
* [1;5]
* [1;4][2;5]
* [1;3][2;4][3;5]
* [1;2][2;3][3;4][4;5]
* [1;1][2;2][3;3][4;4][5;5]
* [2;1][3;2][4;3][5;4]
* [3;1][4;2][5;3]
* [4;1][5;2]
* [5;1]
*
v  1  2  3  4  5
*
1| 6  4  2  6  2
2| 5  6  5  7  8
3| 3  1  6  8  8
4| 3  5  7  8  9
5| 2  5  8  6  5
* */