public class Task29 {

    public Task29() {
    }

    public String run(char c, String str1, String str2) {
        str1 = str1.replaceAll(String.valueOf(c), str2 + c);
        return str1;
    }
}
