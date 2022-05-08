public class Task1 {

    public Task1() {
    }

    public double fact(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * fact(n - 1);
        }
    }
}
