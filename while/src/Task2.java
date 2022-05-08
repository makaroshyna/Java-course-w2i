public class Task2 {

    public Task2() {
    }

    public int run(int a, int b) {

        int n = 0;

        while (a >= b) {
            a = a - b;
            n++;
        }

        return n;
    }
}
