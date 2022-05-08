import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task88Test {

    @Test
    void run() {
        Task88 task88 = new Task88();

        int[][] matrix = {
                {2,  5, 1,  7,  4},
                {9, -2, 4,  2, -5},
                {9,  3, 6,  9, -3},
                {6,  3, 2,  2,  9},
                {2,  4, 3, -3,  1}
        };

        int[][] expected = {
                {2,  5, 1,  7,  4},
                {0, -2, 4,  2, -5},
                {0,  0, 6,  9, -3},
                {0,  0, 0,  2,  9},
                {0,  0, 0,  0,  1}
        };

        int[][] actual = task88.run(matrix, 5);
        Assertions.assertEquals(expected.length, actual.length);

        for (int i = 0; i < expected.length; i++) {
            Assertions.assertArrayEquals(expected[i], actual[i]);
        }
    }
}