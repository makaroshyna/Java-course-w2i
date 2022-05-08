public class Task15 {

    public Task15() {
    }

    public int run(int x) {

        int third = x % 10;
        x = x / 10;
        int second = x % 10;
        x = x / 10;
        int first = x % 10;
        int n = (second * 100) + (first * 10) + third;
        return n;
    }
}
