public class Task1 {

    public Task1() {
    }

    public Task1Solution run(int n, int[] array) {

        int min = array[0];
        int max = array[0];

        for (int i = 0; i < n; i++) {
            if (max < array[i]) {
                max = array[i];
            }

            if (min > array[i]) {
                min = array[i];
            }
        }

        return new Task1Solution(min, max);
    }
}
