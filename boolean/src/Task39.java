import static java.lang.Math.abs;

public class Task39 {

    public Task39() {
    }

    public boolean run(int x1, int y1, int x2, int y2) {
        return abs(x2 - x1) == abs(y2 - y1) ||
                x1 == x2 || y1 == y2;
    }
}
