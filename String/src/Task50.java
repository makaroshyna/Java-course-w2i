public class Task50 {

    public Task50() {
    }

    public String run(String str) {
        String[] words = str.split(" ");
        String str0 = "";

        for (int i = words.length - 1; i >= 0; i--) {
            if (words[i].equals("")) {
                continue;
            } else if (i == 0) {
                str0 = str0 + words[i];
            } else {
                str0 = str0 + words[i] + " ";
            }
        }
        return str0;
    }
}
