public class Task20 {

    public Task20() {
    }

    public boolean run(int x) {

        int third = x % 10;
        x = x / 10;
        int second = x % 10;
        int first = x / 10;

        return third != second && third != first && second != first;
    }
}
