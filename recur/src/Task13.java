public class Task13 {

    public Task13() {
    }

    public boolean run(String s) {
        return isEqual(s, 0);
    }

    private boolean isEqual(String s, int n) {

        if (s.length() / 2 < n) {
            return true;
        } else if (s.charAt(n) == s.charAt(s.length() - n - 1)) {
            n++;
            return isEqual(s, n);
        } else {
            return false;
        }
    }
}
