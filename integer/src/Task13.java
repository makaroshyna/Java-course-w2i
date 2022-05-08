public class Task13 {

    public Task13() {
    }

    public int run(int x) {

        int first = x / 100;
        x = x - (first * 100);
        int n = (x * 10) + first;
        return n;
    }
}
