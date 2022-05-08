public class Task47 {

    public Task47() {
    }

    public int run(int[] array, int n) {

        int res = 1;

        for (int i = 1; i < n; i++) {
            res++;
            for (int j = i - 1; j >= 0; j--) {
                if (array[i] == array[j]) {
                    --res;
                    break;
                }
            }
        }

        return res;
    }
}
