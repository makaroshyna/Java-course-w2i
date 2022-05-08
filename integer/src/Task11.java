public class Task11 {

    public Task11() {
    }

    public MyNumber run(int x) {

        int third = x % 10;
        x = x / 10;
        int second = x % 10;
        x = x / 10;
        int first = x % 10;

        int sum = third + second + first;
        int mul = third * second * first;

        MyNumber n = new MyNumber(sum, mul);
        return n;
    }
}
