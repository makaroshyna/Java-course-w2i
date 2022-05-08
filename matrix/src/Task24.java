public class Task24 {

    public Task24() {
    }

    public int[] run(int[][] a, int m, int n) {

        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            int max = 0;

            for (int j = 0; j < m; j++) {
                if (a[j][i] > array[i]) {
                    array[i] = a[j][i];

                }
            }
        }

        return array;
    }
}
