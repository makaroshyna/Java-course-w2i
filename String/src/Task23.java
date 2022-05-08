public class Task23 {

    public Task23() {
    }

    public int run(String str) {

        int result = str.charAt(0) - 48;
        for (int i = 1; i < str.length(); i = i + 2) {
            int digit = str.charAt(i + 1) - 48;

            if (str.charAt(i) == '+') {
                result = result + digit;
            } else {
                result = result - digit;
            }
        }

        return result;
    }
}
