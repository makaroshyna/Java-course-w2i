public class Task53 {

    public Task53() {
    }

    public int[][] run(int[][] a, int m, int n) {

        int j = 0;
        boolean positive;


        for (j = n - 1; j >= 0; j--) {

            positive = true;
            for (int i = 0; i < m; i++) {

                if (a[i][j] < 0) {
                    positive = false;
                    break;
                }
            }
            if (positive) {
                break;
            }
        }

        for (int i = 0; i < m; i++) {
            int temp = a[i][0];
            a[i][0] = a[i][j];
            a[i][j] = temp;
        }

        return a;
    }
}
