public class Task7 {

    public Task7() {
    }

    public int run(int n) {
        int k = 1;
        while (n >= (k * k)) {
            k++;
        }

        return k;
    }
}
