public class Task33 {

    public Task33() {
    }

    public int[] run(int n) {

        int first = 0;
        int second = 1;
        int third = 0;
        int[] array = new int[n];
        array[0] = first;
        array[1] = second;

        for (int i = 2; i < n; i++) {
            third = first + second;
            first = second;
            second = third;
            array[i] = third;
        }

        return array;
    }
}
