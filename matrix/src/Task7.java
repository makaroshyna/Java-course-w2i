public class Task7 {

    public Task7() {
    }

    public int[] run(int[][] a, int m, int n, int k) {

        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = a[k - 1][i];
        }

        return array;
    }
}
