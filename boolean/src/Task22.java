public class Task22 {

    public Task22() {
    }

    public boolean run(int x) {

        int third = x % 10;
        x = x / 10;
        int second = x % 10;
        int first = x / 10;

        return (first < second && second < third) ||
                (first > second && second > third);
    }
}
