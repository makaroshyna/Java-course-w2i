public class Task5 {

    public Task5() {
    }

    public MyNumber run(int a, int b, int c) {
        int pos;
        int neg;

        if (a > 0 && b < 0 && c < 0 ||
                b > 0 && a < 0 && c < 0 ||
                c > 0 && a < 0 && b < 0) {
            pos = 1;
            neg = 2;

        } else if (a > 0 && b > 0 && c < 0 ||
                a > 0 && c > 0 && b < 0 ||
                c > 0 && b > 0 && a < 0) {
            pos = 2;
            neg = 1;

        } else if ( a > 0 && b > 0 && c > 0) {
            pos = 3;
            neg = 0;

        } else {
            pos = 0;
            neg = 3;
        }

        MyNumber x = new MyNumber(pos, neg);
        return x;
    }
}
