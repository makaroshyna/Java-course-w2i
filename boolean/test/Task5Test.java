import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task5Test {

    @Test
    void run() {

        Task5 task5 = new Task5();

        assertFalse(task5.run(0, 0));
        assertTrue(task5.run(0, -3));
    }
}