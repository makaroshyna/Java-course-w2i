public class Task26 {

    public Task26() {
    }

    public double run(double x) {
        if (x <= 0) {
            return (0 - x);
        } else if (x > 0 && x < 2) {
            return x * x;
        } else {
            return 4;
        }
    }
}
