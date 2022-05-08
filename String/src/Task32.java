public class Task32 {

    public Task32() {
    }

    public int run(String str, String str2) {

        int count = 0;
        int from = 0;

        for (;;) {
            int index = str.indexOf(str2, from);

            if (index >= 0) {
                count++;
                from = index + 1;
            } else {
                break;
            }
        }

        return count;
    }
}
