import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task53Test {

    @Test
    void run() {
        Task53 task53 = new Task53();

        int[][] matrix = new int[][] {
                {1, 5, 2, 7, 4, 6},
                {4, -2, 9, 2, -5, 1},
                {6, 3, 9, 9, -3, -3},
                {2, 3, 6, 2, 9, 9},
                {3, 4, 2, -3, 1, -6}
        };

        int[][] expected = new int[][] {
                {2, 5, 1, 7, 4, 6},
                {9, -2, 4, 2, -5, 1},
                {9, 3, 6, 9, -3, -3},
                {6, 3, 2, 2, 9, 9},
                {2, 4, 3, -3, 1, -6}
        };

        int[][] actual = task53.run(matrix, 5, 6);
        Assertions.assertEquals(expected.length, actual.length);
        for (int i = 0; i < expected.length; i++) {
            Assertions.assertArrayEquals(expected[i], actual[i]);
        }
    }
}