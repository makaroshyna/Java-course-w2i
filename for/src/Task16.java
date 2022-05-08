public class Task16 {

    public Task16() {
    }

    public double[] run(double a, int n) {

        double[] array = new double[n];
        double res = 1;

        for (int i = 0; i < n; i++) {
            res = res * a;
            array[i] = res;
        }

        return array;
    }
}
