public class Task10 {

    public Task10() {
    }

    public MyNumber run(int x) {

        int t = x % 10;
        int f = x / 10;
        int s = f % 10;
        MyNumber n = new MyNumber(t, s);
        return n;
    }
}