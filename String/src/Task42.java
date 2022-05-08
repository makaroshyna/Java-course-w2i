public class Task42 {

    public Task42() {
    }

    public int run(String str) {

        int i = 0;
        int count = 0;

        while (i < str.length()) {
            if (str.charAt(i) == ' ') {
                i++;
            } else {
                char firstLetter = str.charAt(i);
                while (i < str.length() && str.charAt(i) != ' ') {
                    i++;
                }
                char lastLetter = str.charAt(i - 1);

                if (firstLetter == lastLetter) {
                    count++;
                }
            }
        }

        return count;
    }
}