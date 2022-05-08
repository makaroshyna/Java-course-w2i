public class Task9 {

    public Task9() {
    }

    public String run(int n, char c1, char c2) {

        String str = "";
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                str = str + c1;
            } else {
                str = str + c2;
            }
        }

        return str;
    }
}
