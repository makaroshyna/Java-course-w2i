import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task12Test {

    @Test
    void run() {
        Task12 task12 = new Task12();

        int[] array = new int[] {-62, -2, 38, 345, 2, 46, 5, 1, 1};
        Assertions.assertEquals(1, task12.run(9, array));

        array = new int[] {-24, -6, -12, -345, -34, -12};
        Assertions.assertEquals(0, task12.run(6, array));
    }
}