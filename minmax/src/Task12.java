public class Task12 {

    public Task12() {
    }

    public int run(int n, int[] array) {

        int min = 0;

        for (int i = 0; i < n; i++) {
            if (array[i] > 0 && min > array[i] || min == 0 && array[i] > 0) {
                min = array[i];
            }
        }

        return min;
    }
}
