import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task38Test {

    @Test
    void run() {
        Task38 task38 = new Task38();

        assertFalse(task38.run(1, 1, 3, 2));
        assertTrue(task38.run(1, 1, 5, 5));
        assertTrue(task38.run(5, 1, 2, 4));
    }
}