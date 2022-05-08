public class Task1 {

    public Task1() {
    }

    public int run(int [] array) {
        int n = 0;

        for (int i = 0; i < array.length; i ++) {
            n = n + array[i];
        }

        return n;
    }
}
