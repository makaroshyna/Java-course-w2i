public class Task19 {

    public Task19() {
    }

    public Task19Solution run(int[] array) {

        int[] res = new int[array.length];
        int j = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[i - 1]) {
                res[j] = array[i];
                j++;
            }
        }

        return new Task19Solution(res, j);
    }
}
