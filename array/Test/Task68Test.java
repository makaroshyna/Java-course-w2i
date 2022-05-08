import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task68Test {

    @Test
    void run() {
        Task68 task68 = new Task68();

        int[] input = new int[] {67, 2, 56, 13, 1};
        int[] actual = new int[] {1, 2, 56, 13, 67};
        Assertions.assertArrayEquals(actual, task68.run(5, input));

        input = new int[]{38, 359, 1294, 34, 56, 45, 1293, 35};
        actual = new int[]{38, 359, 34, 1294, 56, 45, 1293, 35};
        Assertions.assertArrayEquals(actual, task68.run(8, input));
    }
}