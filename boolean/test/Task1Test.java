import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task1Test {

    @Test
    void run() {

        Task1 task1 = new Task1();

        assertTrue(task1.run(1));
        assertFalse(task1.run(-10));
        assertFalse(task1.run(0));
    }
}