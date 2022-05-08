public class Task46 {

    public Task46() {
    }

    public int run(String str) {
        int length = 0;
        int i = 0;

        while (i < str.length()) {
            if (str.charAt(i) == ' ') {
                i++;
            } else {

                int firstIndex = i;
                while (i < str.length() && str.charAt(i) != ' ') {
                    i++;
                }
                int lastIndex = i;

                if (length < (lastIndex - firstIndex)) {
                    length = lastIndex - firstIndex;
                }
            }
        }
        return length;
    }
}
