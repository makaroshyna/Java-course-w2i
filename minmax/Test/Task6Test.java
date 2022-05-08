import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task6Test {

    @Test
    void run() {
        Task6 task6 = new Task6();

        Task6Solution expected = new Task6Solution(4, 5);
        int[] array = new int[] {48, 45, 334, 2, 334, 2, 45};
        Assertions.assertEquals(expected, task6.run(7, array));

        expected = new Task6Solution(3, 2);
        array = new int[] {77, 77, 2, 45, 2, 2};
        Assertions.assertEquals(expected, task6.run(6, array));
    }
}