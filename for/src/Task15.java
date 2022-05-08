public class Task15 {

    public Task15() {
    }

    public double run(double a, int n) {

        double res = 1;

        for (int i = 0; i < n; i++) {
            res = res * a;
        }

        return res;
    }
}
