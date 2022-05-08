import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task30Test {

    @Test
    void run() {
        Task30 task30 = new Task30();

        int[][] array = {
                {13, 24, 5, 4},
                {24, 56, 1, 6},
                {43, 25, 6, 2}
        };
        int[] expected = new int[] {46, 87, 76};
        Assertions.assertArrayEquals(expected, task30.run(3, 4, array));
    }
}