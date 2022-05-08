public class Task15 {

    public Task15() {
    }

    public int run(int k, int[] array) {

        int res = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i]  > k) {
                res = array[i];
            }
        }

        return res;
    }
}