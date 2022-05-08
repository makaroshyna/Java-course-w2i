public class Task32 {

    public Task32() {
    }

    public boolean run(int a, int b, int c) {
        int a2 = a * a;
        int b2 = b * b;
        int c2 = c * c;
        return a2 == b2 + c2 || b2 == a2 + c2 || c2 == a2 + b2;
    }
}
