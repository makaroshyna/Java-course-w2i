public class Task5 {

    public Task5() {
    }

    public double[] run(int n) {

        double[] cost = new double[10];

        for (int i = 1; i <= 10; i++) {
            cost[i - 1] = i / 10d * n;
        }

        return cost;
    }
}
