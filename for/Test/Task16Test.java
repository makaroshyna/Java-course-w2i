import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task16Test {

    @Test
    void run() {
        Task16 task16 = new Task16();

        double[] expected = new double[]{5, 25, 125, 625, 3125};
        double[] actual = task16.run(5, 5);
        Assert.assertArrayEquals(expected, actual, 0.0001);

        expected = new double[]{0.9, 0.81, 0.729, 0.6561};
        actual = task16.run(0.9, 4);
        Assert.assertArrayEquals(expected, actual, 0.00001);
    }
}