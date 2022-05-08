public class Task7 {

    public Task7() {
    }

    public int[] run(int n, int a, int b) {

        int[] array = new int[n];
        array[0] = a;
        array[1] = b;
        int sum = a + b;

        for (int i = 2; i < n; i++) {
            array[i] = sum;
            sum += array[i];
        }

        return array;
    }
}
