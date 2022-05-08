import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class Task7Test {

    @org.junit.jupiter.api.Test
    void run() {
        Task7 task7 = new Task7();

        int[][] matrix = new int[][] {
                {5, 2, 7, 4, 2, 7},
                {6, 2, 3, 1, 6, 6},
                {5, 4, 3, 2, 1, 7},
                {9, 1, 2, 6, 4, 3}};
        int[] expected = new int[] {6, 2, 3, 1, 6, 6};
        Assertions.assertArrayEquals(expected, task7.run(matrix, 4, 6, 2));
    }
}