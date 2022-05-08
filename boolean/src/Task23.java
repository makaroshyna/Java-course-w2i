public class Task23 {

    public Task23() {
    }

    public boolean run(int x) {

        int fourth = x % 10;
        x = x / 10;
        int third = x % 10;
        x = x / 10;
        int second = x % 10;
        int first = x / 10;

        return fourth == first && third == second;
    }
}
