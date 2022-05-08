public class Task13 {

    public Task13() {
    }

    public double run(int n) {

        double result = 0;
        int min = 1;

        for (double i = 1; i <= n; i++) {
            result = result + min * (1 + 0.1 * i);
            min = - min;
        }

        return result;
    }
}
