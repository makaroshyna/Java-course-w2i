public class Task68 {

    public Task68() {
    }

    public int[] run(int n, int[] a) {

        int max = a[0];
        int min = a[0];
        int maxI = 0;
        int minI = 0;

        for (int i = 1; i < n; i++) {
            if (a[i] > max) {
                max = a[i];
                maxI = i;
            } else if (a[i] < min) {
                min = a[i];
                minI = i;
            }
        }

        a[maxI] = min;
        a[minI] = max;

        return a;
    }
}
