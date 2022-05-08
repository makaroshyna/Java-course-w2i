public class Task41 {

    public Task41() {
    }

    public int run(String str) {

        int count = 0;

        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) != ' ' && str.charAt(i + 1) == ' ') {
                count++;
            }
        }

        count++;

        return count;
    }
}
