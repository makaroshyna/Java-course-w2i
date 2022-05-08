public class Task10 {

    public Task10() {
    }

    public String run(String str) {

        String newStr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            newStr = newStr + str.charAt(i);
        }

        return newStr;
    }
}
