public class Task14 {

    public Task14() {
    }

    public int run(int x) {

        int third = x % 10;
        x = (x / 10);
        int n = (third * 100) + x;
        return n;
    }
}
