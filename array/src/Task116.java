import java.util.Arrays;

public class Task116 {

    public Task116() {
    }

    public Task116Solution run(int[] a, int n) {

        int[] b = new int[n];
        int[] c = new int[n];
        int pos = -1;

        for (int i = 0; i < n; i++) {
            if (pos == -1 || a[i] != c[pos]) {
                pos++;
            }
            c[pos] = a[i];
            b[pos]++;
        }
        int length = pos + 1;

        return new Task116Solution(
                Arrays.copyOf(b, length),
                Arrays.copyOf(c, length));
    }
}
