import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task24Test {

    @Test
    void run() {
        Task24 task24 = new Task24();

        int[][] matrix = new int[][] {
                {1, 5, 2, 7, 4, 6},
                {4, 2, 9, 23, 53, 12},
                {65, 34, 98, 99, 33, 34},
                {247, 374, 6, 234, 900, 901},
                {37, 4564, 234, 3563, 12, 6}
        };
        int[] actual = new int[] {247, 4564, 234, 3563, 900, 901};
        Assertions.assertArrayEquals(actual, task24.run(matrix, 5, 6));
    }
}