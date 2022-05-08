public class Task26 {

    public Task26() {
    }

    public String run(String str, int n) {

        String str2 = "";
        if (str.length() >= n) {
            str2 = str.substring(str.length() - n);
        } else {
            str2 = ".".repeat(n - str.length()) + str;
        }

        return str2;
    }
}
