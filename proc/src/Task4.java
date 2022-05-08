public class Task4 {

    public Task4() {
    }

    public Task4Solution run(int a) {

        double p = 3 * a;
        double S = a * a * Math.sqrt(3) / 4;

        return new Task4Solution(p, S);
    }
}
