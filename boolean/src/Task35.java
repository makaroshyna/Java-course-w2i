public class Task35 {

    public Task35() {
    }

    public boolean run(int x1, int y1, int x2, int y2) {
        return ((x1 + y1) % 2 == 1 && (x2 + y2) % 2 == 1) ||
                ((x1 + y1) % 2 == 0 && (x2 + y2) % 2 == 0);
    }
}
