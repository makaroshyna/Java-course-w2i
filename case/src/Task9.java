public class Task9 {

    public Task9() {
    }

    public MyNumber run(int d, int m) {

        int day = d;
        int month = m;

        switch (m) {
            case 1, 3, 5, 7, 8, 10, 12:
                if (d > 0 && d < 31) {
                    day = d + 1;
                } else {
                    day = 1;
                    month = m + 1;
                }
                break;

            case 2:
                if (d > 0 && d < 28) {
                    day = d + 1;
                } else {
                    day = 1;
                    month = m + 1;
                }
                break;

            case 4, 6, 9, 11:
                if (d > 0 && d < 30) {
                    day = d + 1;
                } else {
                    day = 1;
                    month = m + 1;
                }
                break;

            default:
                return new MyNumber(d, m);
        }

        return new MyNumber(day, month);
    }
}
