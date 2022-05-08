public class Task12 {

    public Task12() {
    }

    public double run(int n) {

        double result = 1;
        for (int i = 1; i <= n; i++) {

            result = result * (1 + 0.1 * i);
        }

        return result;
    }
}
