import org.junit.jupiter.api.Assertions;

class Task5Test {

    @org.junit.jupiter.api.Test
    void run() {
        Task5 task5 = new Task5();

        double[] expected = new double[]{0.5, 1, 1.5, 2, 2.5, 3, 3.5, 4, 4.5, 5};
        double[] actual = task5.run(5);
        Assertions.assertArrayEquals(expected, actual);
        expected = new double[]{1.5, 3, 4.5, 6, 7.5, 9, 10.5, 12, 13.5, 15};
        actual = task5.run(15);
        Assertions.assertArrayEquals(expected, actual);
    }
}