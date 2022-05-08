public class Task16 {

    public Task16() {
    }

    public int run(int x) {

        int third = x % 10;
        x = x / 10;
        int second = x % 10;
        x = x / 10;
        int first = x % 10;
        int n = (first * 100) + (third * 10) + second;
        return n;
    }
}
