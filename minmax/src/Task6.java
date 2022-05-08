public class Task6 {

    public Task6() {
    }

    public Task6Solution run(int n, int[] array) {

        int min = array[0];
        int max = array[0];

        int minNumber = 0;
        int maxNumber = 0;

        for (int i = 0; i < n; i++) {
            if (max <= array[i]) {
                max = array[i];
                maxNumber = i + 1;
            }

            if (min > array[i]) {
                min = array[i];
                minNumber = i + 1;
            }
        }

        return new Task6Solution(minNumber, maxNumber);
    }
}
