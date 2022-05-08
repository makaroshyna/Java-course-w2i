public class Task16 {

    public Task16() {
    }

    public int run(int k, int[] array) {

        int res = 0;

        for (int i = 0; i < array.length; i++) {
            if (k < array[i]) {
                res = array[i];
            }
        }

        return res;
    }
}
