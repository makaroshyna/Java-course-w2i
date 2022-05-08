public class Task33 {

    public Task33() {
    }

    public boolean run(int a, int b, int c) {
        return a < b + c && b < a + c && c < a + b;
    }
}
