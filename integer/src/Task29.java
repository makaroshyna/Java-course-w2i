public class Task29 {

    public Task29() {
    }

    public MyNumber run(int a, int b, int c) {

        int n = (a / c) * (b / c);
        int x = a * b - n * c * c;

        MyNumber r = new MyNumber(n, x);
        return r;
    }
}