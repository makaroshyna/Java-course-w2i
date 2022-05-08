public class Task30 {

    public Task30() {
    }

    public int[] run(int k, int n, int[][] array) {

        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < n; j++) {
                res[i] += array[i][j];
            }
        }

        return res;
    }
}
