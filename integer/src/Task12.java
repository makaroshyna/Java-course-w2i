public class Task12 {

    public Task12() {
    }

    public int run(int x) {

        int third = x % 10;
        x = x / 10;
        int second = x % 10;
        x = x / 10;
        int first = x % 10;

        int rev = (third * 100) + (second * 10) + first;
        return rev;
    }
}
