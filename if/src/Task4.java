public class Task4 {

    public Task4() {
    }

    public int run(int a, int b, int c) {
        if (a > 0 && b < 0 && c < 0 ||
                b > 0 && a < 0 && c < 0 ||
                c > 0 && a < 0 && b < 0) {
            return 1;
        } else if (a > 0 && b > 0 && c < 0 ||
                a > 0 && c > 0 && b < 0 ||
                c > 0 && b > 0 && a < 0) {
            return 2;
        } else if ( a > 0 && b > 0 && c > 0) {
            return 3;
        } else {
            return 0;
        }
    }
}
