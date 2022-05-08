public class Task36 {

    public Task36() {
    }

    public double run(int n, int k) {

        double res = 0;
        double p = 0;

        for (int i = 1; i <= n; i++) {
            p = Math.pow(i, k);
            res = res + p;
        }

        return res;
    }
}
