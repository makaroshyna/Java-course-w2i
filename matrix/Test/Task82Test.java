import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task82Test {

    @Test
    void run() {
        Task82 task82 = new Task82();

        int[][] matrix = {
                {2,  5, 1,  7,  4},
                {9, -2, 4,  2, -5},
                {9,  3, 6,  9, -3},
                {6,  3, 2,  2,  9},
                {2,  4, 3, -3,  1}
        };

        int[] expected = {4, 2, 0, 27, 9, 11, 15, 10, 2};

        Assertions.assertArrayEquals(expected, task82.run(matrix, 5));
    }
}