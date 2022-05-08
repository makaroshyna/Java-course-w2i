public class Task14 {

    public Task14() {
    }

    public int run(String str) {

        int capitalLetterNumber = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))) {
                capitalLetterNumber++;
            }
        }

        return capitalLetterNumber;
    }
}
