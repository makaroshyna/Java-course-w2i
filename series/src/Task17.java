import java.util.Arrays;

public class Task17 {

    public Task17() {
    }

    public double[] run(double b, double[] array) {

        double[] res = new double[array.length + 1];

        for (int i = 0; i < array.length; i++) {
            res[i] = array[i];
        }

        res[res.length - 1] = b;
        Arrays.sort(res);

        return res;
    }
}
