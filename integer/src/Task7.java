import java.util.Objects;

public class Task7 {

    public Task7() {
    }

    public MyNumber run(int x) {
        int l = x / 10;
        int r = x % 10;
        int sum = l + r;
        int min = l - r;
        MyNumber n = new MyNumber(sum, min);
        return n;
    }
}