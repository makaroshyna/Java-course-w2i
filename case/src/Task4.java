public class Task4 {

    public Task4() {
    }

    public int run(int x) {

        int a;
        switch (x) {
            case 1, 3, 5, 7, 8, 10, 12:
                a = 31;
                break;
            case 2:
                a = 28;
                break;
            case 4, 6, 9, 11:
                a = 30;
                break;
            default:
                return x;
        }
        return a;
    }
}
