public class Task37 {

    public Task37() {
    }

    public String run(String str, String str1, String str2) {

        int from = 0;
        int index;
        int lastIndex = 0;

        for (;;) {
            index = str.indexOf(str1, from);

            if (index >= 0) {
                lastIndex = index;
                from = index + 1;
            } else {
                break;
            }
        }

        String before = str.substring(0, lastIndex);
        String after = str.substring(lastIndex + str1.length());
        String newStr = before + str2 + after;

        return newStr;
    }
}