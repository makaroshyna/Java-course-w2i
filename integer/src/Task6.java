import java.util.Objects;

public class Task6 {

    public Task6() {
    }

    public MyNumber run(int x) {
        int l = x / 10;
        int r = x % 10;
        MyNumber n = new MyNumber(l, r);
        return n;
    }
}