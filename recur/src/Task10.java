public class Task10 {

    public Task10() {
    }

    public int run(int k) {

        if (k >= 10) {
            return k % 10 + run(k / 10);
        } else {

            return k;
        }
    }
}
