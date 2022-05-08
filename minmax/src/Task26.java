public class Task26 {

    public Task26() {
    }

    public int run(int n, int[] array) {

        int max = 0;
        int even = 0;
        for (int i = 0; i < n; i++) {
            if (array[i] % 2 == 0) {
                max++;
            } else {
                max = 0;
            }

            if (even < max) {
                even = max;
            }
        }

        return even;
    }
}
