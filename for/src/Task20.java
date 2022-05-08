public class Task20 {

    public Task20() {
    }

    public double run(double a) {

        double res = 0;
        double n = 1;

        for (int i = 1; i <= a; i++) {
            n = n * i;
            res = res + n;
        }

        return res;
    }
}
