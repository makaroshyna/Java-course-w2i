import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task2Test {

    @Test
    void run() {
        Task2 task2 = new Task2();

        Assertions.assertEquals(4, task2.run(3));
        Assertions.assertEquals(-8, task2.run(-6));
        Assertions.assertEquals(134, task2.run(133));
    }
}