public class Task19 {

    public Task19() {
    }

    public int run(String str) {

        boolean isInteger = false;
        boolean isDouble = false;

        for (int i = 0; i < str.length(); i++) {

            if (Character.isDigit(str.charAt(i))) {
                isInteger = true;
            } else {
                isInteger = false;
                break;
            }
        }

        int dot = 0;
        for (int i = 0; i < str.length(); i++) {

            if (Character.isDigit(str.charAt(i)) && dot <= 1) {
                isDouble = true;
            } else if (str.contains(".") && dot <= 1) {
                isDouble = true;
                dot++;
            } else {
                isDouble = false;
                break;
            }
        }

        if (isInteger) {
            return 1;
        } else if (isDouble) {
            return 2;
        } else {
            return 0;
        }
    }
}
