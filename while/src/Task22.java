public class Task22 {

    public Task22() {
    }

    public boolean run(int n) {
        int k = 2;
        while ((n - 1 > k) && (n % k != 0)) {
            k++;
        }

        return n % k != 0;
    }
}
