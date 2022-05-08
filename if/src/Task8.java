public class Task8 {

    public Task8() {
    }

    public MyNumber run(int x, int y) {
        if (x > y) {
            return new MyNumber(x, y);
        } else {
            return new MyNumber(y, x);
        }
    }
}
