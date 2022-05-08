public class Task11 {

    public Task11() {
    }

    public int run(int n) {

        int k = 0;
        int sum = 0;

        while (n > sum) {
            k++;
            sum = sum + k;
        }

        return k;
    }
}
