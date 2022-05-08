public class Task30 {

    public Task30() {
    }

    public String run(char c, String str1, String str2) {
        str1 = str1.replaceAll(String.valueOf(c), c + str2);
        return str1;
    }
}
