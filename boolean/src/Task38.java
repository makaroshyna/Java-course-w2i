import static java.lang.Math.abs;

public class Task38 {

    public Task38() {
    }

    public boolean run(int x1, int y1, int x2, int y2) {
        return abs(x2 - x1) == abs(y2 - y1);
    }
}
