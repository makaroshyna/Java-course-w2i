public class Task11 {

    public Task11() {
    }

    public String run(String str) {

        String space = "";
        for (int i = 0; i < str.length(); i++) {
            if (i == str.length() - 1) {
                space = space + str.charAt(i);
                break;
            }

            space = space + str.charAt(i) + " ";
        }

        return space;
    }
}
