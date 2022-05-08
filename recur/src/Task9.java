public class Task9 {

    public Task9() {
    }

    public int run(int a, int b) {
        if (b == 0) {
            return a;
        } else if (a == 0) {
            return b;
        } else if (a == b) {
            return a;
        } else {
            return run(b, a % b);
        }
    }
}
