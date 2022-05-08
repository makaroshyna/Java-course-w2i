import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task60Test {

    @Test
    void run() {
        Task60 task60 = new Task60();

        int[] input = new int[] {15, 4, 23, 7, 45, 23, 1};
        int[] actual = new int[] {118, 103, 99, 76, 69, 24, 1};
        Assertions.assertArrayEquals(actual, task60.run(input, 7));
    }
}