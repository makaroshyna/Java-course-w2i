import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task19Test {

    @Test
    void run() {
        Task19 task19 = new Task19();

        int[] array = new int[] {47, 74, 676, 1, 24, 5, 231, 56, 34};
        Task19Solution actual = task19.run(array);
        Task19Solution expected = new Task19Solution(new int[]{1, 5, 56, 34, 0, 0, 0, 0, 0}, 4);
        Assertions.assertEquals(expected, actual);

    }
}