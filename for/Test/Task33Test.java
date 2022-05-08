import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task33Test {

    @Test
    void run() {
        Task33 task33 = new Task33();

        int[] expected = new int[]{0, 1, 1, 2, 3, 5, 8, 13, 21, 34};
        int[] actual = task33.run(10);
        Assertions.assertArrayEquals(expected, actual);

        expected = new int[]{0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181};
        actual = task33.run(20);
        Assertions.assertArrayEquals(expected, actual);
    }
}