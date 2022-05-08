public class Task13 {

    public Task13() {
    }

    public int run(String str) {

        int digitNumber = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                digitNumber++;
            }
        }

        return digitNumber;
    }
}
