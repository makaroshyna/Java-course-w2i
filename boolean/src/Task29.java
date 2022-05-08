public class Task29 {

    public Task29() {
    }

    public boolean run(int x, int y, int x1, int y1, int x2, int y2) {
        return x1 < x && x < x2 && y2 < y && y < y1;
    }
}
