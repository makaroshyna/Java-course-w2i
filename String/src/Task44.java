public class Task44 {

    public Task44() {
    }

    public int run(String str) {
        int i = 0;
        int count = 0;

        while (i < str.length()) {
            if (str.charAt(i) == ' ') {
                i++;
            } else {
                int countA = 0;
                while (i < str.length() && Character.isAlphabetic(str.charAt(i))) {
                    if (str.charAt(i) == 'A') {
                        countA++;
                    }
                    i++;
                }
                if (countA == 3) {
                    count++;
                }
            }
        }
        return count;
    }
}
