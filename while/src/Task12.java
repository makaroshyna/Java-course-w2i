public class Task12 {

    public Task12() {
    }

    public int run(int n) {

        int k = 0;
        int sum = 0;

        while (n > sum + k + 1) {
            k++;
            sum = sum + k;
        }

        return k;
    }
}
