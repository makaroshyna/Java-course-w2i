public class Task7 {

    public Task7() {
    }

    public int[] run(String str) {

        int[] firstAndLast= new int[2];
        firstAndLast[0] = str.charAt(0);
        firstAndLast[1] = str.charAt(str.length() - 1);

        return firstAndLast;
    }
}
