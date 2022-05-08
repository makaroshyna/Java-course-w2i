public class Task28 {

    public Task28() {
    }

    public int run(int x, int n) {

        x = x + (n - 2);
        int d = x % 7;
        d = d + 1;
        return d;
    }
}
