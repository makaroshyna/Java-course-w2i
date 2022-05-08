public class Task19 {

    public Task19() {
    }

    public double run(double n) {

        double res = 1;

        for (int i = 1; i <= n; i++) {
            res = res * i;
        }

        return res;
    }
}
