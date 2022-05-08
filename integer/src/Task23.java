public class Task23 {

    public Task23() {
    }

    public int run(int x) {

        int h = x / 3600;
        int min = (x / 60) - (h * 60);

        return min;
    }
}
