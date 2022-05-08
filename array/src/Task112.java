public class Task112 {

    public Task112() {
    }

    public int[] run(int n, int[] a) {

        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n - 1; i++) {
                if (a[i] > a[i + 1]) {
                    int temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;

                    for (int j = 0; j < n; j++) {
                        System.out.print(a[j] + " ");
                    }
                    System.out.println("");
                }
            }
        }

        return a;
    }
}
