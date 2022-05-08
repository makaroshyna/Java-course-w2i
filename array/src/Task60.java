public class Task60 {

    public Task60() {
    }

    public int[] run(int[] a, int n) {

        int[] b = new int[n];
        int num = 0;

        for (int i = 0; i <= n - 1; i++) {
            for (int j = i; j <= n - 1; j++) {
                num = num + a[j];
            }

            b[i] = num;
            num = 0;
        }

        return b;
    }
}
