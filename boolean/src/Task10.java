public class Task10 {

    public Task10() {
    }

    public boolean run(int a, int b) {
        return (a % 2 == 0 && b % 2 == 1)
                || (a % 2 == 1 && b % 2 == 0);
    }
}
