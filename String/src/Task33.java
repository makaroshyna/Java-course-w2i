public class Task33 {

    public Task33() {
    }

    public String run(String str, String str0) {

        int index = str.indexOf(str0);

        if (index == -1) {
            return str;
        } else {
            String before = str.substring(0, index);
            String after = str.substring(index + str0.length());
            return before + after;
        }
    }
}
