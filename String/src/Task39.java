public class Task39 {

    public Task39() {
    }

    public String run(String str) {

        int indexFrom = str.indexOf(' ');
        int indexTo = str.indexOf(' ', indexFrom + 1);

        if (indexTo > 0) {
            return str.substring(indexFrom + 1, indexTo);
        } else {
            return "";
        }
    }
}