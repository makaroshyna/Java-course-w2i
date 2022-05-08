import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task112Test {

    @Test
    void run() {
        Task112 task112 = new Task112();

        int[] input = new int[] {5, 3, 6, 2, 1, 0};
        int[] actual = new int[] {0, 1, 2, 3, 5, 6};
        Assertions.assertArrayEquals(actual, task112.run(6, input));

        input = new int[] {47, 3, 7, 24, 56, 23, 6, 5};
        actual = new int[] {3, 5, 6, 7, 23, 24, 47, 56};
        Assertions.assertArrayEquals(actual, task112.run(8, input));

        input = new int[] {147, 4537489, 0, 324, 4, 56, 23, 466, 34637};
        actual = new int[] {0, 4, 23, 56, 147, 324, 466, 34637, 4537489};
        Assertions.assertArrayEquals(actual, task112.run(9, input));
    }
}