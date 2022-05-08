public class Task22 {

    public Task22() {
    }

    public int run(int x) {

        int h = x / 3600;
        x = x - (h * 3600);

        return x;
    }
}
