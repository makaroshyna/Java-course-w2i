import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task39Test {

    @Test
    void run() {
        Task39 task39 = new Task39();

        assertFalse(task39.run(1, 1, 5, 6));
        assertTrue(task39.run(5, 1, 2, 4));
        assertTrue(task39.run(5, 4, 8, 4));
    }
}