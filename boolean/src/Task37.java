public class Task37 {

    public Task37() {
    }

    public boolean run(int x1, int y1, int x2, int y2) {
        return x1 + 1 == x2 && y1 == y2 ||
                x2 + 1 == x1 && y1 == y2 ||
                y1 + 1 == y2 && x1 == x2 ||
                y2 + 1 == y1 && x1 == x2 ||
                x1 - 1 == x2 && y1 == y2 ||
                x2 - 1 == x1 && y1 == y2 ||
                y1 - 1 == y2 && x1 == x2 ||
                y2 - 1 == y1 && x1 == x2 ||
                x1 + 1 == x2 && y1 + 1 == y2 ||
                x2 + 1 == x1 && y2 + 1 == y1 ||
                y1 + 1 == y2 && x1 + 1 == x2 ||
                y2 + 1 == y1 && x2 + 1== x1 ||
                x1 - 1 == x2 && y1 + 1 == y2 ||
                x2 - 1 == x1 && y2 + 1 == y1 ||
                y1 - 1 == y2 && x1 + 1 == x2 ||
                y2 - 1 == y1 && x2 + 1 == x1;
    }
}
