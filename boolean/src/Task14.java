public class Task14 {

    public Task14() {
    }

    public boolean run(int a, int b, int c) {
        return (a > 0 && b <= 0 && c <= 0) ||
                (a <= 0 && b > 0 && c <= 0) ||
                (a <= 0 && b <= 0 && c > 0);
    }
}
